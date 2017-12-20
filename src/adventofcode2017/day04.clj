(ns adventofcode2017.day04
  (:require [clojure.string :as str])
  (:use adventofcode2017.inputs))

;;======================================================================
;; Day 4. High-Entropy Passphrases
;;======================================================================

(defn valid-passphrase?
  [p]
  (let [ps (into #{} p)]
    (= (count p) (count ps))))

(defn day-4a
  "Day 4. High-Entropy Passphrases - Part 1"
  ([input]
   (let [pp (map #(str/split % #"\s+")
                 (str/split input #"\n\s*"))]
     (count (filter valid-passphrase? pp))))
  ([] (day-4a day-4-input)))

(defn sort-words
  [p]
  (map #(apply str (sort %)) p))

(defn day-4b
  "Day 4. High-Entropy Passphrases - Part 2"
  ([input]
   (let [pp (map #(str/split % #"\s+")
                 (str/split input #"\n\s*"))
         pps (map sort-words pp)]
     (count (filter valid-passphrase? pps))))
  ([] (day-4b day-4-input)))
