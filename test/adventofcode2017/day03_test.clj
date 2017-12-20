(ns adventofcode2017.day03-test
  (:use clojure.test
        adventofcode2017.day03))

(deftest test-day-3a
  (testing "Day 3. Spiral Memory - Part 1"
    (is (= (day-3a) 419))))

(deftest test-day-3b
  (testing "Day 3. Spiral Memory - Part 2"
    (is (= (day-3b) 295229))))
