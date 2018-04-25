(defproject gsig "0.1.0-SNAPSHOT"
  :dependencies [[integrant "0.6.3"]
                 [ring "1.6.3"]
                 [bidi "2.1.3"]
                 [rum "0.11.2"]]
  :source-paths ["src/clj" "src/cljc"]
  :main gsig.main
  :profiles {:dev {:dependencies [[alembic "0.3.2"]
                                  [integrant/repl "0.3.1"]]
                   :source-paths ["dev/src"]
                   :repl-options {:init-ns user}}})
