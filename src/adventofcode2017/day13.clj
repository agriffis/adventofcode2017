(ns adventofcode2017.day13
  (:require [clojure.string :as str])
  (:use adventofcode2017.inputs))

;;======================================================================
;; Day 13. Packet Scanners
;;======================================================================

(defn- dbg [s] (prn s) s)

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

(defn day-13a
  ""
  ([input]
   nil)
  ([] (day-13a day-13-input)))

(defn day-13b
  ""
  ([input]
   nil)
  ([] (day-13b day-13-input)))
