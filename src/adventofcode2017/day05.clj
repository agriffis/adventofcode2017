(ns adventofcode2017.day05
  (:use adventofcode2017.inputs))

;;======================================================================
;; Day 5. A Maze of Twisty Trampolines, All Alike
;;======================================================================

(defn day-5a
  "Day 5. A Maze of Twisty Trampolines, All Alike - Part 1"
  ([jumps maze pos]
   (let [j (get maze pos)]
     (if-not j
       jumps
       (recur (inc jumps) (assoc maze pos (inc j)) (+ pos j)))))
  ([maze] (day-5a 0 maze 0))
  ([] (day-5a day-5-input)))

(defn day-5b
  "Day 5. A Maze of Twisty Trampolines, All Alike - Part 2"
  ([jumps maze pos]
   (let [j (get maze pos)]
     (if-not j
       jumps
       (recur (inc jumps)
              (assoc maze pos (if (> j 2) (dec j) (inc j)))
              (+ pos j)))))
  ([maze] (day-5b 0 maze 0))
  ([] (day-5b day-5-input)))
