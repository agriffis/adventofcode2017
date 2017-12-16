(ns adventofcode2017.day12
  (:require [clojure.string :as str])
  (:use adventofcode2017.inputs))

;;======================================================================
;; Day 12. Digital Plumber
;;======================================================================

(defn- dbg [s] (prn s) s)

(defn- parse-lines
  "Parse an input string into neat lines."
  [input]
  (->> (str/split input #"\n")
       (map str/trim)
       (filter not-empty)))

(defn- parse-int
  "Parse string to integer."
  [x]
  (. Integer parseInt (str x)))

(defn- parse-node
  "Parse a line of input into a node for an adjacency list.
   The node format is [k (children...)]"
  [line]
  (->> (re-seq #"\d+" line)
       (map parse-int)
       (#(vector (first %) (rest %)))))

(defn- parse-graph
  "Parse an input string into an adjacency list stored as a map."
  [input]
  (into {} (map parse-node (parse-lines input))))

(defn- graph-seq
  "Return a lazy sequence of nodes connected to k."
  ([graph k] (graph-seq graph #{k} k))
  ([graph visited k]
   (let [children (remove (partial contains? visited) (get graph k))
         visited (apply conj visited k children)]
     (lazy-seq
       (cons k (mapcat (partial graph-seq graph visited) children))))))

(defn- graph-groups
  "Return a lazy sequence of groups in the graph."
  ([graph] (graph-groups graph #{}))
  ([graph visited]
   (when-let [k (first (remove (partial contains? visited)
                               (keys graph)))]
     (let [group (graph-seq graph k)
           visited (apply conj visited group)]
       (lazy-seq
         (cons group (graph-groups graph visited)))))))

(defn day-12a
  "How many programs in group 0?"
  ([input]
   (let [graph (parse-graph input)]
     (count (dbg (graph-seq graph 0)))))
  ([] (day-12a day-12-input)))

(defn day-12b
  "How many groups in the graph?"
  ([input]
   (let [graph (parse-graph input)]
     (count (dbg (graph-groups graph)))))
  ([] (day-12b day-12-input)))
