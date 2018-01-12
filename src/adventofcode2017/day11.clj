(ns adventofcode2017.day11
  (:require [clojure.string :as str]
            [clojure.walk :refer :all]))

(def input (slurp "resources/day11.txt"))

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

(defn part1
  "Length of shortest path to final destination."
  [input]
  (let [steps (str/split input #",")
        step-counts (keywordize-keys (frequencies steps))]
    (apply + (vals (optimize-steps step-counts)))))

(defn- take-a-step
  "Take a step in any direction, update and optimize the step-counts map.
   For example, given step-counts {:n 4} and step :s, returns {:n 3}."
  [step-counts step]
  (-> (merge {step 0} step-counts)
      (update step inc)
      (optimize-steps)))

(defn part2
  "Find the max distance wandered from starting point, incrementally by
   mapping over steps."
  [input]
  (let [steps (map keyword (str/split input #","))]
    (apply max (map #(apply + (vals %))
                    (reductions take-a-step {} steps)))))
