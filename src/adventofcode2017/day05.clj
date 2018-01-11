(ns adventofcode2017.day05
  (:require [clojure.string :as str]))

(def input
  (->> (slurp "resources/day05.txt")
       str/split-lines
       (map #(Integer/parseInt %))))

(defn part1
  [input]
  (loop [jumps 0
         maze (vec input)
         pos 0]
    (let [j (get maze pos)]
      (if-not j
        jumps
        (recur (inc jumps) (update maze pos inc) (+ pos j))))))

(defn part2
  [input]
  (loop [jumps 0
         maze (vec input)
         pos 0]
    (let [j (get maze pos)]
      (if-not j
        jumps
        (recur (inc jumps)
               (assoc maze pos (if (> j 2) (dec j) (inc j)))
               (+ pos j))))))
