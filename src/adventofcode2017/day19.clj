(ns adventofcode2017.day19
  (:require [clojure.string :as str]))

(def input (slurp "resources/day19.txt"))
(def m (mapv #(vec (replace {\space nil} %))
             (str/split-lines input)))
(def p {:x 27 :y 0 :dx 0 :dy 1})
(def letters (into #{} "ABCDEFGHIJKLMNOPQRSTUVWXYZ"))
(def v (conj letters \| \+))
(def h (conj letters \- \+))

(defn look
  [m {:keys [x y]}]
  (get-in m [y x]))

(defn move
  [{:keys [dx dy] :as p}]
  (-> p (update :x + dx) (update :y + dy)))

(defn turn
  [m {:keys [x y dx dy] :as p}]
  (let [[vh dxy] (if (zero? dy) [v :dy] [h :dx])]
    (merge p (first
               (filter #(vh (look m (move %)))
                       (map #(assoc p :dx 0 :dy 0 dxy %)
                            [1 -1]))))))

(defn walk
  [m p]
  (lazy-seq
   (when-let [v (look m p)]
     (cons (assoc p :v v)
           (walk m (move (if (= (look m p) \+) (turn m p) p)))))))

(defn part1 [] (str/join (filter letters (map :v (walk m p)))))

(defn part2 [] (count (walk m p)))
