(ns adventofcode2017.day07
  (:require [clojure.string :as str]
            [clojure.walk :refer :all]))

(def input (slurp "resources/day07.txt"))

(defn dbg [s] (prn s) s)

(defn parse-int
  [s]
  (Integer/parseInt (str s)))

(defn- inc-nil [x] (inc (or x 0)))

(defn- word-counts
  ([s] (word-counts {} s))
  ([words s]
   (if (empty? s)
     words
     (recur (update-in words [(first s)] inc-nil) (rest s)))))

;; grep -Ewo '[a-z]+' | sort | uniq -u
(defn part1
  [input]
  (let [words (re-seq #"[^\d\W]+" input)]
    (filter #(= (second %) 1) (word-counts words))))

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
  (->> (str/split-lines input)
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

(defn part2
  [input]
   (let [nodes (parse-nodes input)
         adj-map (parse-adj-map input)
         root (find-root adj-map)
         tree (->tree root nodes adj-map)]
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

