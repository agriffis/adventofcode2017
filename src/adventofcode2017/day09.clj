(ns adventofcode2017.day09
  (:require [clojure.string :as str])
  (:use adventofcode2017.inputs))

;;======================================================================
;; Day 9. Stream Processing
;;======================================================================

(def garbage ["<>"
              "<random characters>"
              "<<<<>"
              "<{!>}>"
              "<!!>"
              "<!!!>>"
              "<{o\"i!a,<{i<a>"])

(def examples ["{{<!>},{<!>},{<!>},{<a>}}"])

(defn remove-garbage
  [input]
  (str/replace input #"((?:!.|[^<])*)<(?:!.|[^>])*>" "$1"))

(defn total-score
  ([input]
   (total-score (str/replace input #"[^{}]" "") 0 0))
  ([input level score]
   (if (empty? input)
     score
     (let [next-score (if (= (first input) \}) (+ score level) score)
           next-level (if (= (first input) \{) (inc level) (dec level))
           next-input (rest input)]
       (total-score next-input next-level next-score)))))

(defn day-9a
  ([input]
   (total-score (remove-garbage input)))
  ([] (day-9a day-9-input)))

(defn keep-garbage-no-angles
  [input]
  (str/replace input #"((?:!.|[^<])*)(?:<((?:!.|[^>])*)>)?" "$2"))

(defn drop-canceled
  [input]
  (str/replace input #"!." ""))

(defn day-9b
  ([input]
   (-> input
       keep-garbage-no-angles
       drop-canceled
       count))
  ([] (day-9b day-9-input)))
