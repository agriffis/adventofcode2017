(ns adventofcode2017.day10
  (:require [clojure.string :as str])
  (:use adventofcode2017.inputs))

;;======================================================================
;; Day 10. Knot Hash
;;======================================================================

(defn- knot-hashes
  ([n lengths]
   (knot-hashes (vec (range n)) 0 0 lengths))
  ([string knot-start skip lengths]
   (when-let [knot-length (first lengths)]
     (let [string-length (count string)
           knot-end (+ knot-start knot-length)
           ;; Double the string so it's easy to reverse a section
           ;; without worrying about circling around.
           dub-string (vec (concat string string))
           dub-knot (vec (concat (subvec dub-string 0 knot-start)
                                 (reverse (subvec dub-string knot-start knot-end))
                                 (subvec dub-string knot-end)))
           ;; Now make a new string from the doubled knotted string.
           new-string (subvec dub-knot string-length
                              (max knot-end string-length))
           new-string (concat new-string
                              (subvec dub-knot (count new-string)))
           new-string (vec (take string-length new-string))]
       (lazy-seq
         (cons new-string (knot-hashes new-string
                                       (mod (+ knot-start knot-length skip) (count string))
                                       (inc skip)
                                       (rest lengths))))))))

(defn day-10a
  ([input]
   (let [parsed (map parse-int (re-seq #"\d+" input))]
     (->> parsed (knot-hashes 256) last (take 2) (apply *))))
  ([] (day-10a day-10-input)))

(defn day-10b
  ([input]
   (let [input (concat (map int input) [17 31 73 47 23])
         input (apply concat (repeat 64 input))
         knotted (last (knot-hashes 256 input))]
     (->> knotted
          (partition 16)
          (map #(apply bit-xor %))
          (map #(format "%02x" %))
          str/join)))
  ([] (day-10b day-10-input)))
