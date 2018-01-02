(ns adventofcode2017.day18b
  (:require [clojure.string :as str]))

(def input (slurp "resources/day18.txt"))

(def example "snd 1\nsnd 2\nsnd p\nrcv a\nrcv b\nrcv c\nrcv d")

(defn dispatch
  [regs ins]
  (let [[i a b] (re-seq #"\S+" ins)
        [va vb] (map #(try (Integer/parseInt %)
                           (catch NumberFormatException e (regs % 0))) [a b])]
    (merge regs {:ip (inc (:ip regs))}
           (case i
             "set" {a vb}
             "add" {a (+ va vb)}
             "mul" {a (* va vb)}
             "mod" {a (mod va vb)}
             "rcv" (if-let [rcv (peek (:rcv regs))]
                     {a rcv :rcv (pop (:rcv regs))}
                     {:ip (:ip regs)})  ; override inc to try again
             "snd" {:snd (conj (:snd regs) va)}
             "jgz" (when (pos? va) {:ip (+ (:ip regs) vb)})))))

(defn queue
  ([] (clojure.lang.PersistentQueue/EMPTY))
  ([coll]
    (reduce conj clojure.lang.PersistentQueue/EMPTY coll)))

(defn step-program
  [program {ip :ip :as regs}]
  (if-let [ins (nth program ip)]
    (dispatch regs ins)
    regs))

(defn run-programs
  ([input] (run-programs (vec (str/split input #"\n"))
                         (mapv (fn [pid] {:ip 0
                                          :rcv (queue)
                                          :snd []
                                          "p" pid}) (range 2))))
  ([program pregs]
   (when (or (some #(not (str/starts-with? (nth program (:ip %)) "rcv")) pregs)
             (some #(seq (:snd %)) pregs)
             (some #(seq (:rcv %)) pregs))
     (let [pregs (update-in pregs [0 :rcv] #(apply conj % (get-in pregs [1 :snd])))
           pregs (update-in pregs [1 :rcv] #(apply conj % (get-in pregs [0 :snd])))
           pregs (assoc-in pregs [0 :snd] [])
           pregs (assoc-in pregs [1 :snd] [])
           pregs (mapv (partial step-program program) pregs)]
       (lazy-seq (cons pregs (run-programs program pregs)))))))

(defn day-18b [] (count (filter #(seq (get-in % [1 :snd])) (run-programs input))))
