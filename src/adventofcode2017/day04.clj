(ns adventofcode2017.day04
  (:require [clojure.string :as str]))

(def input (slurp "resources/day04.txt"))

(defn valid-passphrase?
  [p]
  (let [ps (into #{} p)]
    (= (count p) (count ps))))

(defn part1
  [input]
  (let [lines (str/split-lines input)
        pp (map #(re-seq #"\S+" %) lines)]
    (count (filter valid-passphrase? pp))))

(defn sort-words
  [p]
  (map #(apply str (sort %)) p))

(defn part2
  [input]
  (let [lines (str/split-lines input)
        pp (map #(re-seq #"\S+" %) lines)
        pps (map sort-words pp)]
    (count (filter valid-passphrase? pps))))
