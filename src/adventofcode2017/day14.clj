;;======================================================================
;; Day 14. Disk Defragmentation
;;======================================================================

(ns adventofcode2017.day14
  (:require [clojure.string :as str]
            [adventofcode2017.day10 :refer [day-10b]])
  (:use clojure.test))

(def day-14-example "flqrgnkx")

(def day-14-input "ffayrhll")

(defn- count-bits-in-knot
  "Count the bits in a knot."
  [knot]
  (apply + (->> (partition 16 16 nil knot)
                (map str/join)
                (map #(Long/parseUnsignedLong % 16))
                (map #(Long/bitCount %)))))

(defn day-14a
  "How many squares are used?"
  ([] (day-14a day-14-input))
  ([input]
   (let [row-keys (map #(str input "-" %) (range 128))
         row-knots (map day-10b row-keys)]
     (apply + (map count-bits-in-knot row-knots)))))

(deftest test-day-14a
  (testing "day 14 part 1"
    (is (= (day-14a day-14-example) 8108))
    (is (= (day-14a) 8190))))

(defn- bin
  "Format a long integer as zero-padded n-bit binary."
  [i n]
  (->> (Long/toBinaryString i)
       (format (str "%" n "s"))
       (#(str/replace % " " "0"))))

(defn- binary-knot
  "Format a knot (hex string representing a large integer) as binary."
  [knot]
  (str/join (->> (partition 16 16 nil knot)
                 (map str/join)  ; need strings for parseLong
                 ; parse/pad in one pass so length is available
                 (map #(bin (Long/parseUnsignedLong % 16)
                            (* 4 (count %)))))))

(defn- make-grid
  "Make a grid from a sequence of knots. The grid is represented as
  a vector, across then down."
  [knots]
  (->> knots
       (map binary-knot)
       (mapcat (partial replace {\0 nil \1 0}))
       vec))

(defn- x-y
  "Return the [x y] coordinates for a vector index."
  [grid index]
  (let [edge (int (Math/sqrt (count grid)))]
    (vector (mod index edge) (quot index edge))))

(defn- get-cell
  "Return the value in a cell. Nil if invalid cell."
  [grid x y]
  (let [edge (int (Math/sqrt (count grid)))]
    (when (and (>= x 0) (< x edge)
               (>= y 0) (< y edge))
      (get grid (+ (* y edge) x)))))

(defn- min-neighbor
  "Return the minimum value >=1 in a neighboring cell, or itself."
  ([grid index] (apply min-neighbor grid (x-y grid index)))
  ([grid x y]
   (let [look (fn [dx dy] (get-cell grid (+ x dx) (+ y dy)))
         around (->> [(look 0 -1) (look +1 0) (look 0 +1) (look -1 0) (look 0 0)]
                     (filter identity)
                     (filter #(>= % 1)))]
     (when (seq around)
       (apply min around)))))

(defn- fill-grid
  "Mark the regions in the grid."
  ([grid]
   (println "filling grid")
   (fill-grid grid 0 1))
  ([grid index filler]
   (cond
     (>= index (count grid)) grid
     (nil? (get grid index)) (recur grid (inc index) (inc filler))
     :else (let [region (or (min-neighbor grid index) filler)]
             (recur (assoc grid index region)
                    (inc index)
                    (inc filler))))))

(defn- count-grid
  "Count the marked regions in the grid."
  [grid]
  (dec (count (into #{} grid))))

(defn- settle-grid
  "Fill the grid until it stops changing."
  [grid]
  (let [filled (fill-grid grid)]
    (println (count-grid filled))
    (if (= filled grid)
      filled
      (recur filled))))

(defn day-14b
  "How many regions?"
  ([] (day-14b day-14-input))
  ([input]
   (let [row-keys (map #(str input "-" %) (range 128))
         knots (map day-10b row-keys)
         grid (make-grid knots)]
     (count-grid (settle-grid grid)))))

(deftest test-day-14b
  (testing "day 14 part 2"
    (is (= (day-14b day-14-example) 1242))
    (is (= (day-14b) 1134))))
