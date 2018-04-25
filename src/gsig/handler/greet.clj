(ns gsig.handler.greet
  (:require [integrant.core :as ig]
            [ring.util.response :as res]))

(defmethod ig/init-key ::index [_ {:keys [name]}]
  (fn [_] (res/response (str "Hello " name "!"))))
