(ns circularuins.test.core
  (:require [clojure.test :refer :all]
            [circularuins.core :refer :all]
            [ring.mock.request :as mock]))

(deftest test-app
  (testing "main-route"
    (let [response (app (mock/request :get "/"))]
      (is (= (:status response) 200))
      (is (= (:body response) "clojure"))))

  (testing "not-found route"
    (let [response (app (mock/request :get "/invalid"))]
      (is (= (:status response) 404))))

  (testing "sentou route"
    (let [response (app (mock/request :get "/demo/d3/sentou/all"))]
      (is (= (:status response) 200))
      (is (= (:headers response) {"Content-Type" "application/json"})))))
