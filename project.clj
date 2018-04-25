(defproject gsig "0.1.0-SNAPSHOT"
  :dependencies [[integrant "0.6.3"]
                 [ring "1.6.3"]
                 [rum "0.11.2"]]
  :profiles {:dev {:dependencies [[integrant/repl "0.3.1"]]
                   :source-paths ["dev/src"]}})
