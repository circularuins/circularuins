(ns circularuins.sentou)

(def sensi-data [["gokuu" [["777/7/7" 100]
                           ["778/7/8" 1120]]]
                 ["pikkoro" [["777/7/15" 105]
                             ["778/6/7" 820]]]])

(defn make-map-seq [data]
  (map #(array-map :age (get % 0) :power (get % 1)) data))

(defn sensi-map [data]
  (apply merge (map #(hash-map (keyword (get % 0)) (make-map-seq (get % 1))) data)))

(def zsensi (sensi-map sensi-data))

(defn all-sensi []
  zsensi)
