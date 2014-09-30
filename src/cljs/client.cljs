(ns hello-clojurescript)

;; (defn handle-click []
;;   (js/alert "Hello!"))

;; (def clickable (.getElementById js/document "clickable"))
;; (.addEventListener clickable "click" handle-click)

(defn d3-callback [error data]
  (def app (.getElementById js/document "app"))
  (set! (.-innerHTML app) (pr-str (js->clj data))))

(.json js/d3 "/demo/d3/sentou/all" d3-callback)
