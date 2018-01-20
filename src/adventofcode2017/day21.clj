(ns adventofcode2017.day21
  (:require [clojure.math.numeric-tower :as math]
            [clojure.string :as str]))

(def input (str/split-lines (slurp "resources/day21.txt")))

(defn ->tile [s] (mapv vec (str/split s #"/")))

(def grid (->tile ".#./..#/###"))

(defn rotate [tile] (->> tile (map reverse) (apply mapv vector)))

(defn flip [tile] (->> tile (map reverse) (mapv vec)))

(defn ->rules [line]
  "Read a line to produce a map of tile patterns (rotated, flipped) to
  resulting tile."
  (let [[patt result] (map ->tile (str/split line #" => "))]
    (into {} (map vector
                  (->> (iterate rotate patt)
                       (take 4)
                       (mapcat #(vector % (flip %))))
                  (repeat result)))))

(def rules (reduce merge (map ->rules input)))

(defn get-tile [grid x y z]
  (mapv #(subvec % x (+ x z))
        (subvec grid y (+ y z))))

(defn disassemble [grid]
  (let [n (count grid)
        z (if (even? n) 2 3)
        r (range 0 n z)]
    (for [y r x r]
      (get-tile grid x y z))))

(defn assemble [tiles]
  (->> (partition (math/sqrt (count tiles)) tiles)
       (mapcat #(apply map (comp vec concat) %))
       vec))

(defn enhance [grid]
  (->> grid disassemble (map rules) assemble))

(defn part1 []
  (->> (nth (iterate enhance grid) 5)
       flatten
       frequencies))

(defn part2 []
  (->> (nth (iterate enhance grid) 18)
       flatten
       frequencies))
