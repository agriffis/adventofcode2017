(ns adventofcode2017.day02
  (:require [clojure.string :as str]))

(def input (slurp "resources/day02.txt"))

(defn parse-int
  [s]
  (Integer/parseInt (str s)))

(defn- parse-spreadsheet
  [input]
  (->> (str/split-lines input)
       (map #(re-seq #"\d+" %))
       (map #(map parse-int %))))

(defn part1
  [input]
  (let [rows (parse-spreadsheet input)]
    (apply + (map #(- (apply max %) (apply min %)) rows))))

(defn whittle
  [s] (map #(identity %2) s (iterate rest s)))

(defn- divide-evenly
  [row]
  (first (flatten (for [divisors (whittle (reverse (apply sorted-set row)))
                        :let [divisor (first divisors)]]
                    (for [dividend (rest divisors)
                          :when (zero? (mod divisor dividend))]
                      (/ divisor dividend))))))

(defn part2
  [input]
  (let [rows (parse-spreadsheet input)
             quotients (map divide-evenly rows)]
    (apply + quotients)))
