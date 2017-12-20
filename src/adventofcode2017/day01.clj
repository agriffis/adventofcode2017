(ns adventofcode2017.day01
  (:use adventofcode2017.inputs))

;;======================================================================
;; Day 1. Inverse Captcha
;;======================================================================

(defn parse-int
  [s]
  (. Integer parseInt (str s)))

(defn day-1a
  "Day 1. Inverse Captcha - Part 1"
  ([input]
   (let [pairs (partition 2 1 (take 1 input) input)]
     (->> pairs
          (filter #(apply = %))
          (map first)
          (map parse-int)
          (apply +))))
  ([] (day-1a day-1-input)))

(defn day-1b
  "Day 1. Inverse Captcha - Part 2"
  ([input]
   (let [inputs (partition (/ (count input ) 2) input)
         pairs (apply map vector inputs)]
     (->> pairs
          (filter #(apply = %))
          flatten
          (map parse-int)
          (apply +))))
  ([] (day-1b day-1-input)))
