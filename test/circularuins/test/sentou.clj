(ns circularuins.test.sentou
  (:require [clojure.test :refer :all]
            [circularuins.sentou :refer :all]
            [ring.mock.request :as mock]))

(def test-sensi-data [["sensi-1" [["111/1/1" 10]
                            ["222/2/2" 20]]]
                ["sensi-2" [["333/3/3" 30]
                            ["444/4/4" 40]]]])
(def test-age-power-data (get (get test-sensi-data 0) 1))

(deftest test-sentou
  (testing "make-map-seq"
    (is (= (first (make-map-seq test-age-power-data)) {:age "111/1/1", :power 10}))))
