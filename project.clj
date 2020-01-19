(defproject congraph "0.0.3"
  :description "a neo4j connection management library based on conman"
  :license {:name "Apache License, Version 2.0"
            :url "http://www.apache.org/licenses/LICENSE-2.0.html"}
  :dependencies [[org.clojure/clojure "1.10.1"]
                 [hugneo4j "0.0.3"]]
  :profiles
  {:dev
   {:dependencies [[mount "0.1.16"]]}})
