(ns adventofcode2017.core-test
  (:require [clojure.test :refer :all]
            [adventofcode2017.core :refer :all]))

(deftest test-day-1a
  (testing "Day 1. Inverse Captcha - Part 1"
    (is (= (day-1a "1122") 3))
    (is (= (day-1a "1111") 4))
    (is (= (day-1a "1234") 0))
    (is (= (day-1a "91212129") 9))
    (is (= (day-1a) 1223))))

(deftest test-day-1b
  (testing "Day 1. Inverse Captcha - Part 2"
    (is (= (day-1b "1212") 6))
    (is (= (day-1b "1221") 0))
    (is (= (day-1b "123425") 4))
    (is (= (day-1b "123123") 12))
    (is (= (day-1b "12131415") 4))
    (is (= (day-1b) 1284))))

(deftest test-day-2a
  (testing "Day 2. Corruption Checksum - Part 1"
    (is (= (day-2a day-2a-example) 18))
    (is (= (day-2a) 54426))))

(deftest test-day-2b
  (testing "Day 2. Corruption Checksum - Part 2"
    (is (= (day-2b day-2b-example) 9))
    (is (= (day-2b) 333))))

(deftest test-day-3a
  (testing "Day 3. Spiral Memory - Part 1"
    (is (= (day-3a) 419))))

(deftest test-day-3b
  (testing "Day 3. Spiral Memory - Part 2"
    (is (= (day-3b) 295229))))
