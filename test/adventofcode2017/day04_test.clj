(ns adventofcode2017.day04-test
  (:use clojure.test
        adventofcode2017.day04))

(deftest test-day-4a
  (testing "Day 4. High-Entropy Passphrases - Part 1"
    (is (= (day-4a) 451))))

(deftest test-day-4b
  (testing "Day 4. High-Entropy Passphrases - Part 2"
    (is (= (day-4b) 223))))
