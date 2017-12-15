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
  "Optimize the step-counts map for an opposing pair.
   For example, given {:n 4 :s 2} with the pair [:n :s],
   optimize the map to {:n 2 :s 0}."
  [step-counts [forward back]]
  (let [steps-forward (get step-counts forward 0)
        steps-back (get step-counts back 0)]
    (assoc step-counts
           forward (max 0 (- steps-forward steps-back))
           back (max 0 (- steps-back steps-forward)))))

(defn- cancel-opposites
  "Optimize the step-counts map for all the opposing pairs."
  [step-counts]
  (reduce cancel-opposite step-counts opposites))

(defn- cut-corner
  "Optimize the step-counts map to take a shortcut.
   For example, given {:n 4 :sw 2} with the shortcut
   [:n :sw :nw] (meaning that :nw is a shortcut for :n :sw)
   optimize the map to {:n 2 :nw 2}."
  [step-counts [zig zag shortcut]]
  (let [zigs (get step-counts zig 0)
        zags (get step-counts zag 0)
        zig-zags (min zigs zags)]
    (-> (merge {shortcut 0 zig 0 zag 0} step-counts)
        (update shortcut + zig-zags)
        (update zig - zig-zags)
        (update zag - zig-zags))))

(defn- cut-corners
  "Optimize the step-counts map for all the shortcuts.
   Recurses since one round of corner-cutting reveals more possibilities."
  [step-counts]
  (let [new-step-counts (reduce cut-corner step-counts shortcuts)]
    (if (= new-step-counts step-counts)
      new-step-counts
      (recur new-step-counts))))

(defn- optimize-steps
  "Update the step-counts map by taking shortcuts and avoiding movements
   that cancel each other."
  [step-counts]
  (-> step-counts
      cut-corners
      cancel-opposites))

(defn day-11a
  "Length of shortest path to final destination."
  ([input]
   (let [steps (str/split input #",")
         step-counts (keywordize-keys (frequencies steps))]
     (apply + (vals (optimize-steps step-counts)))))
  ([] (day-11a day-11-input)))

(defn day-11b-brute
  "Run 11a algorithm on all the sub-paths to find the max distance from
   starting position. This does a lot of work because it has to re-count
   the steps every time."
  ([input]
   (let [steps (map keyword (str/split input #","))]
     (apply max (for [length (range (count steps) 0 -1)
                      :let [steps (take length steps)
                            step-counts (frequencies steps)]]
                  (apply + (vals (optimize-steps step-counts)))))))
  ([] (day-11b-brute day-11-input)))

(defn- take-a-step
  "Take a step in any direction, update and optimize the step-counts map.
   For example, given step-counts {:n 4} and step :s, returns {:n 3}."
  [step-counts step]
  (-> (merge {step 0} step-counts)
      (update step inc)
      (optimize-steps)))

(defn- count-steps
  "Given a sequence of steps, generate a lazy sequence of optimized
   step-counts. This is like mapping or reducing over take-a-step, in fact
   its raison-d'être is that we need the combination of map (generate a new
   sequence) with reduce (accumulating a result)."
  ([steps]
   (count-steps {} steps))
  ([step-counts steps]
   (lazy-seq
     (when-let [step (first steps)]
       (let [step-counts (take-a-step step-counts step)]
         (cons step-counts (count-steps step-counts (rest steps))))))))

(defn day-11b-incremental
  "Find the max distance wandered from starting point, incrementally by
   mapping over count-steps. Given the puzzle input, this runs 50x faster
   than day-11b-brute."
  ([input]
   (let [steps (map keyword (str/split input #","))]
     (apply max (map #(apply + (vals %))
                     (count-steps steps)))))
  ([] (day-11b-incremental day-11-input)))
