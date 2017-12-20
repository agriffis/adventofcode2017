(ns adventofcode2017.core-test
  (:require [clojure.test :refer :all]
            [adventofcode2017.day03 :refer :all]))

(deftest test-day-3a
  (testing "Day 3. Spiral Memory - Part 1"
    (is (= (day-3a) 419))))

(deftest test-day-3b
  (testing "Day 3. Spiral Memory - Part 2"
    (is (= (day-3b) 295229))))
