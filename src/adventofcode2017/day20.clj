(ns adventofcode2017.day20
  (:require [clojure.string :as str]))

(def input (slurp "resources/day20.txt"))

(defn parse-point
  [line]
  (let [nums (map #(Integer/parseInt %) (re-seq #"[-\d]+" line))]
    {:p (into {} (map vector [:x :y :z] (take 3 nums)))
     :v (into {} (map vector [:x :y :z] (take 3 (drop 3 nums))))
     :a (into {} (map vector [:x :y :z] (drop 6 nums)))}))

(def points (map parse-point (str/split-lines input)))

(defn distance
  [p]
  (apply + (map #(Math/abs %) (vals p))))

(defn part1
  []
  (let [points (vec points)
        closest (first (sort-by (comp distance :a) points))]
    (.indexOf points closest)))

(defn add-values
  [point ka kb]
  (let [a (point ka) b (point kb)]
    (assoc point ka (into {} (map #(vector % (+ (a %) (b %)))
                                  (keys a))))))

(defn animate-point
  [point]
  (-> point
      (add-values :v :a)
      (add-values :p :v)))

(defn remove-collisions
  [points]
  (let [pp (map :p points)
        pc (reduce
             (fn [pc p] (update pc p inc))
             (into {} (map vector pp (repeat 0)))
             pp)]
    (filter #(= 1 (pc (:p %))) points)))

(defn run-animation
  [points]
  (cons points (lazy-seq
                 (run-animation
                   (->> points
                        (map animate-point)
                        remove-collisions)))))

(defn part2
  []
  (count (nth (run-animation points) 1000)))
