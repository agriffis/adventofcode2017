(ns adventofcode2017.day18b2
  (:require [clojure.string :as str]))

(def input (slurp "resources/day18.txt"))

(defn dispatch
  "Execute a single instruction. Returns the updated registers. Will block
  on rcv. Adds {:done true} if last thread to block, or if sender doesn't
  supply a new promise."
  [regs ins]
  (let [[i a b] (re-seq #"\S+" ins)
        [va vb] (map #(try (Integer/parseInt %)
                           (catch NumberFormatException e (regs % 0))) [a b])
        {:keys [ip blk cnt snd rcv]} regs]
    (merge (update regs :ip inc)
           (case i
             "set" {a vb}
             "add" {a (+ va vb)}
             "mul" {a (* va vb)}
             "mod" {a (mod va vb)}
             "jgz" (when (pos? va) {:ip (+ ip vb)})
             "snd" (let [p (promise)]
                     (swap! blk dec)
                     (deliver snd [va p])
                     {:snd p})
             "rcv" (if (= cnt (swap! blk inc))
                     {:done true}
                     (let [[v p] @rcv]
                       (if p {a v :rcv p} {:done true})))))))

(defn run-program
  "Run single instance of program on registers. Returns a lazy sequence of
  program states. Stops when either regs contains {:done true} or run out
  of instructions."
  [{:keys [ip done snd] :as regs} program]
  (let [ins (nth program ip nil)]
    (if (or done (not ins))
      (do
        (deliver snd nil)  ; Unblock other thread to finish.
        nil)               ; End of program states.
      (lazy-seq
       (let [next-regs (dispatch regs ins)]
         (cons next-regs (run-program next-regs program)))))))

(defn run-futures
  "Run multiple instances of program as futures. funs should be a list of
  functions to process the sequence of program states; the length of funs
  determines the number of futures. Processing happens in the future before
  returning, to avoid holding the seq head unless needed by the caller."
  [input funs]
  (let [program (vec (str/split input #"\n"))
        mailboxes (repeatedly promise)
        blocked (atom 0)]
    (map-indexed
     (fn [pid fun]
       (future
         (let [regs {:ip 0
                     :blk blocked
                     :cnt (count funs)
                     :rcv (nth mailboxes pid)
                     :snd (nth mailboxes (mod (inc pid) (count funs)))
                     "p" pid}]
           (fun (run-program regs program)))))
     funs)))

(defn day-18b
  [input]
  (let [funs [dorun  ; ignore program 0
              #(dec (count (dedupe (map :snd %))))]]
    (map deref (run-futures input funs))))
;=> (nil 7239)
