(ns adventofcode2017.day08
  (:require [clojure.string :as str]))

(def input (slurp "resources/day08.txt"))

(defn parse-ins
  [line]
  (let [[reg op val _ test-reg test-op test-val] (re-seq #"\S+" line)]
    {:reg reg
     :op op
     :val (Integer/parseInt val)
     :test-reg test-reg
     :test-op test-op
     :test-val (Integer/parseInt test-val)}))

(def ops
  {"inc" +
   "dec" -
   "<" <
   ">" >
   "<=" <=
   ">=" >=
   "==" =
   "!=" not=})

(defn run-op
  [op r v regs]
  ((get ops op) (get regs r 0) v))

(defn run-program
  ([instructions] (run-program {} instructions))
  ([regs instructions]
   (lazy-seq
    (when-let [ins (first instructions)]
      (let [new-regs (if (run-op (:test-op ins)
                                 (:test-reg ins)
                                 (:test-val ins) regs)
                       (assoc regs (:reg ins) (run-op (:op ins)
                                                      (:reg ins)
                                                      (:val ins) regs))
                       regs)]
        (cons new-regs (run-program new-regs (rest instructions))))))))

(defn part1
  [input]
  (->> (str/split-lines input)
       (map parse-ins)
       run-program
       last
       vals
       (apply max)))

(defn part2
  [input]
  (->> (str/split-lines input)
       (map parse-ins)
       run-program
       (map vals)
       flatten
       (apply max)))
