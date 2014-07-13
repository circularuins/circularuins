(ns circularuins.sentou)

(def gokuu [["777/7/7" 100]
            ["778/7/8" 120]])
(def sensi ["gokuu"])

(defn make-map-seq [data]
  (map #(array-map :age (get % 0) :power (get % 1)) data))

(defn sensi-map [name data]
  (array-map (keyword name) data))

(def zsensi (sensi-map "gokuu" (make-map-seq gokuu)))

(defn all-sensi []
  zsensi)
