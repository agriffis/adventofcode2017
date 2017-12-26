;;======================================================================
;; Day 14. Disk Defragmentation
;;======================================================================

(ns adventofcode2017.day14
  (:require [clojure.string :as str]
            [adventofcode2017.day10 :refer [day-10b]])
  (:use clojure.test))

(def day-14-example "flqrgnkx")

(def day-14-input "ffayrhll")

(defn- count-bits-in-knot
  "Count the bits in a knot."
  [knot]
  (apply + (->> (partition 8 knot)
                (map str/join)
                (map #(Long/parseLong % 16))
                (map #(Long/bitCount %)))))

(defn day-14a
  "How many squares are used?"
  ([input]
   (let [row-keys (map #(concat input "-" (str %)) (range 128))
         row-knots (map day-10b row-keys)]
     (apply + (map count-bits-in-knot row-knots))))
  ([] (day-14a day-14-input)))

(deftest test-day-14a
  (testing "day 14 part 1"
    (is (= (day-14a day-14-example) 8108))
    (is (= (day-14a) 8190))))
