;;======================================================================
;; Day 15. Disk Defragmentation
;;======================================================================

(ns adventofcode2017.day15
  (:require [clojure.string :as str])
  (:use clojure.test))

(def example [65 8921])

(def inputs [783 325])

(def factors [16807 48271])

(def tests [(fn [x] (zero? (mod x 4)))
            (fn [x] (zero? (mod x 8)))])

(defn- generator-fn
  [factor test]
  (fn [input]
    (filter test (rest (iterate (fn [i] (mod (* i factor) 2147483647))
                                input)))))

(defn- match?
  [values]
  (apply = (map (partial bit-and 0xffff) values)))

(defn count-matches
  ([inputs factors n] (count-matches inputs factors (repeat identity) n))
  ([inputs factors tests n]
   (let [generators (map generator-fn factors tests)]
     (count
       (->> inputs
            (pmap #(apply % %&) generators)
            (apply map vector)
            (take n)
            (filter match?))))))

(defn day-15a [] (count-matches inputs factors 40000000))

(defn day-15b [] (count-matches inputs factors tests 5000000))

(deftest test-day-15
  (testing "day 15"
    (is (= (match? [1]) true))
    (is (= (match? [1 0]) false))
    (is (= (match? [1 1]) true))
    (is (= (match? [0xff 0xff]) true))
    (is (= (match? [0x1ffff 0xffff]) true))
    (is (= (match? [0x2abcd 0x1abcd 0xabcd]) true))
    (is (= (count-matches example factors 40000000) 588))
    (is (= (day-15a) 650))
    (is (= (count-matches example factors tests 5000000) 309))
    (is (= (day-15b) 336))))
