(ns adventofcode2017.day21
  (:require [clojure.string :as str]))

(def input (str/split-lines (slurp "resources/day21.txt")))

(defn ->tile [s] (mapv vec (str/split s #"/")))

(def grid (->tile ".#./..#/###"))

(defn rotate [tile] (->> tile (map reverse) (apply mapv vector)))

(defn flip [tile] (->> tile (map reverse) (mapv vec)))

(defn ->rules [line]
  "Read a line to produce a hash of tile patterns (rotated, flipped) to
  resulting tile."
  (let [[patt result] (->> (str/split line #" => ")
                           (map ->tile))]
    (into {} (map vector
                  (->> (iterate rotate patt)
                       (take 4)
                       (mapcat #(vector % (flip %))))
                  (repeat result)))))

(def rules (reduce merge (map ->rules input)))

(defn get-tile [grid x y size]
  (mapv #(subvec % x (+ x size))
        (subvec grid y (+ y size))))

(defn put-tile [grid y tile]
  (mapv #(into % %2)
        (concat grid (repeat []))
        (concat (repeat y []) tile)))

(defn enhance [grid]
  (let [size (if (even? (count grid)) 2 3)]
    (->> (for [y (range 0 (count grid) size)
               x (range 0 (count grid) size)]
           [y (get-tile grid x y size)])
         (map (fn [[y tile]] [(* (/ y size) (inc size)) (get rules tile)]))
         (reduce (fn [grid [y tile]] (put-tile grid y tile)) []))))

(defn part1 []
  (->> (nth (iterate enhance grid) 5)
       flatten
       frequencies))

(defn part2 []
  (->> (nth (iterate enhance grid) 18)
       flatten
       frequencies))
