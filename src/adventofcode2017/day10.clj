(ns adventofcode2017.day10
  (:require [clojure.string :as str]
            [clojure.core.rrb-vector :as fv]))

(def input "34,88,2,222,254,93,150,0,199,255,39,32,137,136,1,167")

(defn knot-hashes
  [n lengths]
  (loop [string (vec (range n))
         knot-start 0
         skip 0
         lengths lengths]
    (if (empty? lengths)
      string
      (let [knot-length (first lengths)
            string-length (count string)
            knot-end (+ knot-start knot-length)
            ;; Double the string so it's easy to reverse a section
            ;; without worrying about circling around.
            dub-string (vec (concat string string))
            dub-knot (vec (concat (subvec dub-string 0 knot-start)
                                  (rseq (subvec dub-string knot-start knot-end))
                                  (subvec dub-string knot-end)))
            ;; Now make a new string from the doubled knotted string.
            new-string (subvec dub-knot string-length
                               (max knot-end string-length))
            new-string (concat new-string
                               (subvec dub-knot (count new-string)))
            new-string (vec (take string-length new-string))]
        (recur new-string
               (mod (+ knot-start knot-length skip) (count string))
               (inc skip)
               (rest lengths))))))

(defn part1
  [input]
  (let [parsed (map #(Integer/parseInt %) (re-seq #"\d+" input))]
    (->> parsed
         (knot-hashes 256)
         (take 2)
         (apply *))))

(defn part2
  [input]
  (let [input (concat (map int input) [17 31 73 47 23])
        input (apply concat (repeat 64 input))
        knotted (knot-hashes 256 input)]
    (->> knotted
         (partition 16)
         (map #(apply bit-xor %))
         (map #(format "%02x" %))
         str/join)))
