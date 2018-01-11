(ns adventofcode2017.day06)

(def input (slurp "resources/day06.txt"))

(defn bank-with-most
  [banks]
  ;; min-key and max-key return the last index in case of a tie.
  ;; We want the first, so rseq and math.
  (let [ri (first (apply max-key second (map-indexed vector (rseq banks))))]
    (- (count banks) ri 1)))

(defn rotate-banks
  "Rotate banks so index is at the end."
  [banks index]
  (let [banksv (vec banks)]
    (vec (concat (subvec banksv (inc index))
                 (subvec banksv 0 (inc index))))))

(defn unrotate-banks
  "Undo rotate-banks."
  [banks index]
  (rotate-banks banks (- (count banks) index 2)))

(defn redistribute-bank
  ([banks]
   (redistribute-bank banks (bank-with-most banks)))
  ([banks index]
   (let [value (get banks index)
         n (count banks)]
     (-> banks
         (assoc index 0)
         (rotate-banks index)
         (#(map-indexed (fn [i v] (+ v (quot value n)
                                     (if (< i (mod value n)) 1 0))) %))
         (unrotate-banks index)))))

(defn -while-unique
  ([s]
   (-while-unique s #{}))
  ([s seen]
   (when (seq s)
     (let [v (first s) vs (rest s)]
       (when-not (contains? seen v)
         (lazy-seq (cons [v vs] (-while-unique vs (conj seen v)))))))))

(defn take-while-unique
  [s]
  (map first (-while-unique s)))

(defn drop-while-unique
  [s]
  (second (last (-while-unique s))))

(defn part1
  [input]
  (let [banks (mapv #(Integer/parseInt %) (re-seq #"\S+" input))]
    (count (take-while-unique (iterate redistribute-bank banks)))))

(defn part2
  [input]
  (let [banks (mapv #(Integer/parseInt %) (re-seq #"\S+" input))]
    (count (take-while-unique
            (drop-while-unique (iterate redistribute-bank banks))))))
