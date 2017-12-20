(ns adventofcode2017.day08
  (:require [clojure.string :as str])
  (:use adventofcode2017.inputs))

;;======================================================================
;; Day 8. I Heard You Like Registers
;;======================================================================

(defn parse-lines
  [input]
  (->> input
       (#(str/split % #"\n"))
       (map str/trim)
       (filter #(not (str/blank? %)))))

(defn parse-ins
  [line]
  (let [[reg op val _ test-reg test-op test-val] (str/split line #"\s+")]
    {:reg reg
     :op op
     :val (parse-int val)
     :test-reg test-reg
     :test-op test-op
     :test-val (parse-int test-val)}))

(defn parse-input
  [input]
  (map parse-ins (parse-lines input)))

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

(defn day-8a
  ([input]
   (->> input
        parse-input
        run-program
        last
        vals
        (apply max)))
  ([] (day-8a day-8-input)))

(defn day-8b
  ([input]
   (->> input
        parse-input
        run-program
        (map vals)
        flatten
        (apply max)))
  ([] (day-8b day-8-input)))
