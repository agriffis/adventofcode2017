(ns adventofcode2017.day17)

(defn insert-at
  "Insert args into collection at index. Return a lazy seq."
  [coll index & args]
  (let [[left right] (split-at index coll)]
    (concat left (apply conj right (reverse args)))))

(defn next-buffer
  "Calculate the next buffer state given an input state, step and number to
  insert. Returns a vector of [buffer pos]."
  [step [buffer pos] n]
  (let [next-pos (inc (mod (+ pos step) n))]
    [(insert-at buffer next-pos n) next-pos]))

(defn calc-buffer
  "Calculate the resulting buffer, given a transformation function and
  number of times to run."
  [fun times]
  (first
    (reduce fun [[0] 0] (range 1 (inc times)))))

(defn day-17a []
  (second (->> (calc-buffer (partial next-buffer 343) 2017)
               (drop-while #(not= % 2017)))))  ;=> 1914

(defn next-buffer'
  "Calculate the first two elements of the next buffer state."
  [& args]
  (let [[buffer pos] (apply next-buffer args)]
    [(take 2 buffer) pos]))

(defn day-17b []
  (calc-buffer (partial next-buffer' 343) 50000000))  ;=> (0 41797835) in 103 seconds
