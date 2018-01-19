(ns adventofcode2017.day12
  (:require [clojure.string :as str]))

(def input (slurp "resources/day12.txt"))

(defn- dbg [s] (prn s) s)

(defn- parse-node
  "Parse a line of input into a node for an adjacency list.
   The node format is [k (children...)]"
  [line]
  (->> (re-seq #"\d+" line)
       (map #(Integer/parseInt %))
       (#(vector (first %) (rest %)))))

(defn- parse-graph
  "Parse an input string into an adjacency list stored as a map."
  [input]
  (into {} (map parse-node (str/split-lines input))))

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

(defn part1
  [input]
  (let [graph (parse-graph input)]
    (count (dbg (graph-seq graph 0)))))

(defn part2
  [input]
  (let [graph (parse-graph input)]
    (count (dbg (graph-groups graph)))))
