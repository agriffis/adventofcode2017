(ns adventofcode2017.day18
  (:require [clojure.string :as str]))

(def input (slurp "resources/day18.txt"))

(def example "set a 1\nadd a 2\nmul a a\nmod a 5\nsnd a\nset a 0\nrcv a\njgz a -1\nset a 1\njgz a -2")

(defn dispatch
  [regs ins]
  (let [[i a b] (re-seq #"\S+" ins)
        [va vb] (map #(try (Integer/parseInt %)
                           (catch NumberFormatException e (regs % 0))) [a b])]
    (merge regs {:ip (inc (:ip regs))}
           (case i
             "set" {a vb}
             "add" {a (+ va vb)}
             "mul" {a (* va vb)}
             "mod" {a (mod va vb)}
             "rcv" (when-not (zero? va) {:rcv (:snd regs)})
             "snd" {:snd va}
             "jgz" (when (pos? va) {:ip (+ (:ip regs) vb)})))))

(defn run-program
  ([input] (run-program (vec (str/split input #"\n")) {:ip 0}))
  ([program {ip :ip :as regs}]
   (when-let [ins (nth program ip)]
     (let [next-regs (dispatch regs ins)]
       (lazy-seq (cons next-regs (run-program program next-regs)))))))

(defn day-18a [] (first (filter :rcv (run-program input))))
