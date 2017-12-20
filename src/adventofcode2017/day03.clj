(ns adventofcode2017.day03
  (:use adventofcode2017.inputs))

;;======================================================================
;; Day 3. Spiral Memory
;;======================================================================

;; An = An-1 + (An-1 - An-2) + 8
(defn spiral
  ([] (spiral 1 1))
  ([a b] (lazy-seq (cons a (spiral (- (+ a a 8) b) a)))))

(defn spiral-ring
  "Return a vector of [ring base] for the given value."
  ([value]
   ;; This could be handled by the conditional below, but it's not
   ;; necessary to test for this special case every time through the
   ;; loop.
   (if (= value 1)
     [0 0]
     (spiral-ring value 1 (spiral))))
  ([value ring iseq]
   (if (<= value (second iseq))
     [ring (first iseq)]
     (recur value (inc ring) (rest iseq)))))

(defn spiral-rung
  "Return offset (diagonal jog) for the given value."
  ([value]
   (apply spiral-rung value (spiral-ring value)))
  ([value ring base]
   (if (= value 1)
     0
     (let [edge (* 2 ring)
           around (- value base)
           v (mod around edge)]
       (Math/abs (- v (/ edge 2)))))))

(defn day-3a
  "Day 3. Spiral Memory - Part 1"
  ([input]
   (let [[ring base] (spiral-ring input)
         rung (spiral-rung input ring base)]
     (+ ring rung)))
  ([] (day-3a day-3-input)))

(defn spiral-sum
  [grid x y]
  (apply + (for [dx [-1 0 1]
                 dy [-1 0 1]
                 :let [value (get-in grid [(+ x dx) (+ y dy)])]
                 :when value]
             value)))

(defn spiral-sums
  ([] (spiral-sums {0 {0 1}} 0 0 1 1 1 1))
  ([grid x y edge dx dy dir]
   (let [value (spiral-sum grid x y)
         new-grid (assoc-in grid [x y] value)
         [new-x, new-y] (if (pos? dx) [(+ x dir) y] [x (+ y dir)])
         eol (and (zero? dx) (= 1 dy))
         new-dir (if eol (- dir) dir)
         new-edge (if eol (inc edge) edge)
         [new-dx, new-dy] (cond eol [new-edge new-edge]
                                (pos? dx) [(dec dx) dy]
                                :else [0 (dec dy)])]
     (lazy-seq
       (cons value (spiral-sums new-grid new-x new-y new-edge
                                new-dx new-dy new-dir))))))

(defn day-3b
  "Day 3. Spiral Memory - Part 2"
  ([input]
   (first (filter #(< input %) (spiral-sums))))
  ([] (day-3b day-3-input)))
