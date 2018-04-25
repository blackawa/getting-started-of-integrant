(ns user
  (:require [integrant.core :as ig]
            [integrant.repl :refer [clear go halt prep init reset]]
            [gsig.main]))

(defn- config []
  (ig/read-string (slurp (clojure.java.io/resource "config.edn"))))

(integrant.repl/set-prep! (constantly (config)))
