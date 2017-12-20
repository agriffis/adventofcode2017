(ns adventofcode2017.day7
  (:require [clojure.string :as str])
  (:use clojure.walk
        adventofcode2017.inputs))

;;======================================================================
;; Day 7. Recursive Circus
;;======================================================================

(defn dbg [s] (prn s) s)

(defn- inc-nil [x] (if x (inc x) 1))

(defn- word-counts
  ([s] (word-counts {} s))
  ([words s]
   (if (empty? s)
     words
     (recur (update-in words [(first s)] inc-nil) (rest s)))))

;; grep -Ewo '[a-z]+' | sort | uniq -u
(defn day-7a
  ([input]
   (let [words (re-seq #"[^\d\W]+" input)]
     (filter #(= (second %) 1) (word-counts words))))
  ([] (day-7a day-7-input)))

(defn- ->node
  [name weight]
  {:name name :weight (parse-int weight)})

(defn- parse-nodes
  [input]
  (->> input
       (re-seq #"(?m)^(\w+)\s+\((\d+)")
       (map rest)
       (map #(vector (first %) (apply ->node %)))
       (into {})))

(defn- parse-adj-map
  [input]
  (->> input
       (#(str/split % #"\n"))
       (filter #(.contains % "->"))
       (map #(re-seq #"[a-z]+" %))
       (map #(vector (first %) (rest %)))
       (into {})))

(defn- find-root
  [adj-map]
  (let [children (into #{} (flatten (map second adj-map)))]
    (first (drop-while (partial contains? children)
                       (map first adj-map)))))

(defn- ->branch
  [node children]
  (assoc node :children (vec children)))

(defn- ->tree
  [name nodes adj-map]
  (->branch (get nodes name)
            (map #(->tree % nodes adj-map) (get adj-map name))))

(defn day-7b
  ([input]
   (let [nodes (parse-nodes input)
         adj-map (parse-adj-map input)
         root (find-root adj-map)
         tree (->tree nodes adj-map root)]
     (->> tree
          (postwalk (fn [node]
                      (if-let [w (:weight node)]
                        (assoc node :sum
                               (reduce + w (map :sum (:children node))))
                        node)))
          (tree-seq (constantly true) :children)
          (map :sum)
;;        (filter #(= 1623 (:sum %)))
;;        dbg
;;        (map #(vec (map :sum (:children %))))
;;        (filter #(< 1 (count (into #{} %))))
          )))
)

