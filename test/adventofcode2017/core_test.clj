(ns adventofcode2017.core-test
  (:require [clojure.test :refer :all]
            [adventofcode2017.core :refer :all]))

(deftest test-day-1
  (testing "Day 1. Inverse Captcha"
    (is (= (day-1a) 1223))
    (is (= (day-1b) 1284))))
