(ns adventofcode2017.day01-test
  (:use clojure.test
        adventofcode2017.day01))

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
