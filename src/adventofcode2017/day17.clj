(ns adventofcode2017.day17
  (:require [clojure.string :as str]
            [clojure.data.finger-tree :as ft]))

(defn ft-insert-at
  [dl index & args]
  (if (>= index (count dl))
    (apply conj dl args)  ; ft-split-at returns mid=nil which is inconvenient
    (let [[left mid right] (ft/ft-split-at dl index)]
      (ft/ft-concat (conj (into left args) mid) right))))

(defn calc-buffer
  [step times]
  (first
    (reduce (fn [[buffer pos] n]
              (let [pos (inc (mod (+ pos step) (count buffer)))]
                [(ft-insert-at buffer pos n) pos]))
            [(ft/counted-double-list 0) 0] (range 1 (inc times)))))

(defn day-17a []
  (first
    (drop-while #(not= (nth % 3) 2017)
                (partition-all 7 1 (calc-buffer 343 2017)))))
