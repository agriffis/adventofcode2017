(ns adventofcode2017.day11
  (:require [clojure.string :as str])
  (:use adventofcode2017.common
        adventofcode2017.inputs
        clojure.walk))

;;======================================================================
;; Day 11. Hex Ed
;;======================================================================

(def opposites [[:n :s]
                [:nw :se]
                [:ne :sw]])

(def shortcuts [[:n :sw :nw]
                [:n :se :ne]
                [:s :nw :sw]
                [:s :ne :se]
                [:nw :ne :n]
                [:sw :se :s]])

(defn- cancel-opposite
  [step-counts [forward back]]
  (let [steps-forward (get step-counts forward 0)
        steps-back (get step-counts back 0)]
    (assoc step-counts
           forward (max 0 (- steps-forward steps-back))
           back (max 0 (- steps-back steps-forward)))))

(defn- cancel-opposites
  [step-counts]
  (reduce cancel-opposite step-counts opposites))

(defn- cut-corner
  [step-counts [zig zag shortcut]]
  (let [zigs (get step-counts zig 0)
        zags (get step-counts zag 0)
        zig-zags (min zigs zags)]
    (-> step-counts
        (#(merge {shortcut 0 zig 0 zag 0} %))
        (update shortcut + zig-zags)
        (update zig - zig-zags)
        (update zag - zig-zags))))

(defn- cut-corners
  [step-counts]
  (reduce cut-corner step-counts shortcuts))

(defn- optimize-steps
  [step-counts]
  (let [short-steps (-> step-counts
                        cut-corners
                        cancel-opposites)]
     (apply + (vals short-steps))))

(defn day-11a
  ([input]
   (let [steps (str/split input #",")
         step-counts (keywordize-keys (frequencies steps))]
     (optimize-steps step-counts)))
  ([] (day-11a day-11-input)))

(defn day-11b
  ([input]
   (let [steps (map keyword (str/split input #","))]
     (apply max (for [length (range (count steps) 0 -1)
                      :let [steps (take length steps)
                            step-counts (frequencies steps)]]
                  (dbg (optimize-steps step-counts))))))
  ([] (day-11b day-11-input)))
