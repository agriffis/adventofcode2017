(ns adventofcode2017.day09
  (:require [clojure.string :as str]))

(def input (slurp "resources/day09.txt"))

(def examples ["{{<!>},{<!>},{<!>},{<a>}}"])

(def garbage ["<>"
              "<random characters>"
              "<<<<>"
              "<{!>}>"
              "<!!>"
              "<!!!>>"
              "<{o\"i!a,<{i<a>"])

(defn remove-garbage
  [input]
  (str/replace input #"((?:!.|[^<])*)<(?:!.|[^>])*>" "$1"))

(defn total-score
  [input]
  (loop [input (str/replace input #"[^{}]" "")
         level 0
         score 0]
   (if (empty? input)
     score
     (recur (rest input)
            (if (= (first input) \{) (inc level) (dec level))
            (if (= (first input) \}) (+ score level) score)))))

(defn part1 [input] (total-score (remove-garbage input)))

(defn keep-garbage-no-angles
  [input]
  (str/replace input #"((?:!.|[^<])*)(?:<((?:!.|[^>])*)>)?" "$2"))

(defn drop-canceled
  [input]
  (str/replace input #"!." ""))

(defn part2
  [input]
  (-> input
      keep-garbage-no-angles
      drop-canceled
      count))
