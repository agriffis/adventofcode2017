(defproject adventofcode2017 "0.1.0-SNAPSHOT"
  :description "Aron's solutions for Advent of Code 2017"
  :url "http://adventofcode.com/"
  :license {:name "Public Domain"
            :url "http://unlicense.org"}
  :dependencies [[org.clojure/clojure "1.8.0"]]
  :main ^:skip-aot adventofcode2017.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
