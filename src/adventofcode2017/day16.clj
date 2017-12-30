(ns adventofcode2017.day16
  (:require [clojure.string :as str]))

(def dispatch {\s (fn [line x]
                    (let [i (- (count line) (Integer/parseInt x))]
                      (str/join
                        (concat (drop i line) (take i line)))))
               \x (fn [line x]
                    (let [[a b] (map #(Integer/parseInt %) (str/split x #"/"))]
                      (str/join
                        (assoc (vec line)
                               a (get line b)
                               b (get line a)))))
               \p (fn [line x]
                    (let [[a b] (map #(str/index-of line %) (str/split x #"/"))]
                      (str/join
                        (assoc (vec line)
                               a (get line b)
                               b (get line a)))))})

(defn- run-program
  [line input]
  (let [program (str/split input #",")]
    (reduce #((dispatch (first %2)) % (subs %2 1)) line program)))

(def input (slurp "resources/day16.txt"))

(defn day-16a [] (run-program "abcdefghijklmnop" input))  ; "kgdchlfniambejop"

(defn- find-cycle-length
  []
  (loop [n 0
         line "abcdefghijklmnop"
         results #{}]
    (if (contains? results line)
      n
      (recur (inc n)
             (run-program line input)
             (conj results line)))))  ; 42

(defn day-16b []
  (nth (iterate #(run-program % input) "abcdefghijklmnop")
       (mod 1000000000 42)))  ; "fjpmholcibdgeakn"
