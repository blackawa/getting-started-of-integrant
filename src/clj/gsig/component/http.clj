(ns gsig.component.http
  (:require [integrant.core :as ig]
            [ring.adapter.jetty :as jetty]))

(defmethod ig/init-key :gsig.component/http [_ {:keys [endpoint] :as opts}]
  (jetty/run-jetty endpoint (-> opts (dissoc :endpoint) (assoc :join? false))))

(defmethod ig/halt-key! :gsig.component/http [_ server]
  (.stop server))
