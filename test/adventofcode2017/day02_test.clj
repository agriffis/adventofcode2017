(ns adventofcode2017.core-test
  (:require [clojure.test :refer :all]
            [adventofcode2017.day02 :refer :all]))

(deftest test-day-2a
  (testing "Day 2. Corruption Checksum - Part 1"
    (is (= (day-2a day-2a-example) 18))
    (is (= (day-2a) 54426))))

(deftest test-day-2b
  (testing "Day 2. Corruption Checksum - Part 2"
    (is (= (day-2b day-2b-example) 9))
    (is (= (day-2b) 333))))
