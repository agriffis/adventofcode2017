(ns adventofcode2017.day02
  (:require [clojure.string :as str])
  (:use adventofcode2017.inputs))

;;======================================================================
;; Day 2. Corruption Checksum
;;======================================================================

(defn parse-int
  [s]
  (. Integer parseInt (str s)))

(defn- parse-spreadsheet
  [input]
  (->> input
       str/trim
       (#(str/split % #"\n"))
       (map str/trim)
       (map #(str/split % #"\s+"))
       (map #(map parse-int %))))

(defn day-2a
  "Day 2. Corruption Checksum - Part 1"
  ([input]
   (let [rows (parse-spreadsheet input)]
     (apply + (map #(- (apply max %) (apply min %)) rows))))
  ([] (day-2a day-2-input)))

(defn whittle
  [s] (map #(identity %2) s (iterate rest s)))

(defn- divide-evenly
  [row]
  (first (flatten (for [divisors (whittle (reverse (apply sorted-set row)))
                        :let [divisor (first divisors)]]
                    (for [dividend (rest divisors)
                          :when (zero? (mod divisor dividend))]
                      (/ divisor dividend))))))

(defn day-2b
  "Day 2. Corruption Checksum - Part 2"
  ([input]
   (let [rows (parse-spreadsheet input)
         quotients (map divide-evenly rows)]
     (apply + quotients)))
  ([] (day-2b day-2-input)))
