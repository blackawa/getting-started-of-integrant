(ns gsig.main
  (:gen-class)
  (:require [integrant.core :as ig]))

(defn -main [& args]
  (ig/init (ig/read-string (slurp (clojure.java.io/resource "config.edn")))))
