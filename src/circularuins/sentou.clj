(ns circularuins.sentou)

(def sensi-data [["gokuu" [["777/7/7" 100]
                           ["778/7/8" 120]]]
                 ["pikkoro" [["666/6/6" 90]
                             ["667/6/7" 300]]]])

(defn make-map-seq [data]
  (map #(array-map :age (get % 0) :power (get % 1)) data))

(defn sensi-map [data]
  (map #(array-map (keyword (get % 0)) (make-map-seq (get % 1))) data))

(def zsensi (sensi-map sensi-data))

(defn all-sensi []
  zsensi)
