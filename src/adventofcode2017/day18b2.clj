(ns adventofcode2017.day18b2
  (:require [clojure.string :as str]))

(def input (slurp "resources/day18.txt"))

(defn dispatch
  [regs ins]
  (let [[i a b] (re-seq #"\S+" ins)
        [va vb] (map #(try (Integer/parseInt %)
                           (catch NumberFormatException e (regs % 0))) [a b])
        {:keys [blk cnt snd rcv]} regs]
    (merge (update regs :ip inc)
           (case i
             "set" {a vb}
             "add" {a (+ va vb)}
             "mul" {a (* va vb)}
             "mod" {a (mod va vb)}
             "jgz" (when (pos? va) {:ip (+ (:ip regs) vb)})
             "snd" (let [p (promise)]
                     (swap! blk dec)
                     (deliver snd [va p])
                     {:snd p})
             "rcv" (if (= cnt (swap! blk inc))
                     {:done true}
                     (let [[v p] @rcv]
                       (if v {a v :rcv p} {:done true})))))))

(defn run-program
  [{:keys [ip done snd] :as regs} program]
  (let [ins (nth program ip nil)]
    (if (or done (not ins))
      (do (deliver snd nil) nil)
      (lazy-seq
       (let [next-regs (dispatch regs ins)]
         (cons next-regs (run-program next-regs program)))))))

(defn run-futures
  [input funs]
  (let [program (vec (str/split input #"\n"))
        mailboxes (repeatedly promise)
        blocked (atom 0)]
    (map-indexed
     (fn [pid fun]
       (future
         (let [regs {:ip 0
                     :blk blocked
                     :cnt (count funs)
                     :rcv (nth mailboxes pid)
                     :snd (nth mailboxes (mod (inc pid) (count funs)))
                     "p" pid}]
           (fun (run-program regs program)))))
     funs)))

(defn day-18b
  ([] (day-18b input))
  ([input]
   (let [funs [dorun
               #(dec (count (dedupe (map :snd %))))]]
     (map deref (run-futures input funs)))))
;=> (nil 7239)
