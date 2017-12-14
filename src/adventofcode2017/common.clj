(ns adventofcode2017.common)

(defn parse-int
  [s]
  (. Integer parseInt (str s)))

(defn whittle
  [s] (map #(identity %2) s (iterate rest s)))

(defn dbg [s] (prn s) s)
