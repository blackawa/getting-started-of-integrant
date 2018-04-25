(ns gsig.main
  (:require [integrant.core :as ig]
            [ring.adapter.jetty :as jetty]
            [ring.util.response :as res]))

(defmethod ig/init-key :adapter/jetty [_ {:keys [handler] :as opts}]
  (jetty/run-jetty handler (-> opts (dissoc :handler) (assoc :join? false))))

(defmethod ig/halt-key! :adapter/jetty [_ server]
  (.stop server))

(defmethod ig/init-key :handler/greet [_ {:keys [name]}]
  (fn [_] (res/response (str "Hello " name))))
