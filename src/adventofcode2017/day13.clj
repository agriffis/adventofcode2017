;;======================================================================
;; Day 13. Packet Scanners
;;======================================================================

(ns adventofcode2017.day13
  (:require [clojure.string :as str])
  (:use clojure.test))

(defn- dbg->>
  [& args]
  ;(apply prn args)
  (last args))

(defn- parse-lines
  "Parse an input string into neat lines."
  [input]
  (->> (str/split input #"\n")
       (map str/trim)
       (filter not-empty)))

(defn- parse-int
  "Parse string to integer."
  [x]
  (. Integer parseInt (str x)))

(defn- parse-scanner
  "Parse a line of input into a scanner.
   The scanner format is [depth range]."
  [line]
  (->> (re-seq #"\d+" line)
       (mapv parse-int)))

(defn- parse-scanners
  "Parse the input into a list of scanners."
  [input]
  (map parse-scanner (parse-lines input)))

(defn- caught-by-scanner?
  "Check if we're caught by a scanner."
  ([ps [depth range]]
   (zero? (mod (+ depth ps) (- (* range 2) 2)))))

(defn- scanner-severity
  "Return the severity of getting caught by a scanner."
  [[depth range]]
  (* depth range))

(defn- trip-severity
  "Return the severity of an entire trip, with delay."
  ([scanners] (trip-severity scanners 0))
  ([scanners ps]
   (reduce + 0 (->> scanners
                    (filter (partial caught-by-scanner? ps))
                    (dbg->> ps)
                    (map scanner-severity)))))

(def day-13-example "0: 3\n1: 2\n4: 4\n6: 4")

(def day-13-input "0: 5\n1: 2\n2: 3\n4: 4\n6: 6\n8: 4\n10: 8\n12: 6\n14: 6\n16: 14\n18: 6\n20: 8\n22: 8\n24: 10\n26: 8\n28: 8\n30: 10\n32: 8\n34: 12\n36: 9\n38: 20\n40: 12\n42: 12\n44: 12\n46: 12\n48: 12\n50: 12\n52: 12\n54: 12\n56: 14\n58: 14\n60: 14\n62: 20\n64: 14\n66: 14\n70: 14\n72: 14\n74: 14\n76: 14\n78: 14\n80: 12\n90: 30\n92: 17\n94: 18")

(defn day-13a
  "Severity of trip?"
  ([input]
   (trip-severity (parse-scanners input)))
  ([] (day-13a day-13-input)))

(deftest test-day-13a
  (testing "day 13 part 1"
    (is (= (day-13a day-13-example) 24))
    (is (= (day-13a day-13-input) 2604))))

(defn- caught-during-trip?
  "Check if we're caught during a trip. Return the list of scanners that
   caught us."
  ([scanners] (caught-during-trip? scanners 0))
  ([scanners ps]
   (seq (->> scanners
             (filter (partial caught-by-scanner? ps))
             (dbg->> ps)))))

(defn- made-it?
  "Check if we make it through without being caught. Return the picosecond
   delay value or nil."
  [scanners ps]
  (when (not (caught-during-trip? scanners ps)) ps))

(defn day-13b
  "How long to delay to sneak through?"
  ([input]
   (let [scanners (parse-scanners input)]
     (some (partial made-it? scanners) (take 10000000 (range)))))
  ([] (day-13b day-13-input)))

(deftest test-day-13b
  (testing "day 13 part 2"
    (is (= (day-13b day-13-example) 10))
    (is (= (day-13b day-13-input) 3941460))))
