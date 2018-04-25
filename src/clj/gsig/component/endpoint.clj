(ns gsig.component.endpoint
  (:require [bidi.ring :refer [make-handler]]
            [clojure.java.io :as io]
            [integrant.core :as ig]
            [gsig.routes :refer [routes]]))

(defmethod ig/init-key :gsig.component/endpoint [_ handlers]
  ;; bidiのroutesを読んでring handlerに変換して返す
  (make-handler routes #(handlers %)))
