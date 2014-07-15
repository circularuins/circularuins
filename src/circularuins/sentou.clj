(ns circularuins.sentou)

(def sensi-data [["gokuu" [["737/7/7" 2 ]
                           ["738/7/7" 3]
                           ["749/9/1" 100]
                           ["749/9/10" 12]
                           ["750/5/7" 1000]
                           ["750/5/8" 220]
                           ["750/5/9" 230]
                           ["750/5/12" 300]
                           ["753/5/7" 360]
                           ["753/5/8" 380]
                           ["753/5/9" 780]
                           ["756/5/7" 910]
                           ["761/10/12" 1040]
                           ["762/4/29" 2275]
                           ["762/11/3" 32000]
                           ["762/12/18" 10000]
                           ["762/12/24" 150000000]
                           ["764/8/7" 200000000]
                           ["767/5/12" 3375000000]
                           ["767/5/26" 60000000000]
                           ["767/6/30" 92250000000]
                           ["774/5/8" 1200000000000]
                           ["784/5/7" 2000000000000]]]
                 ["pikkoro" [["753/5/9" 260]
                             ["756/5/7" 365 ]
                             ["761/10/12" 1480]
                             ["762/11/3" 2500]
                             ["762/12/18" 3500]
                             ["762/12/24" 1400000]
                             ["764/8/7" 1700000]
                             ["767/5/12" 1200000000]
                             ["767/5/26" 25000000000]
                             ["774/5/8" 26000000000]
                             ["784/5/7" 27000000000]]]
                 ["vegeta" [["732/5/7" 3000]
                            ["734/5/7" 7000]
                            ["737/5/7" 13000]
                            ["762/11/3" 180000]
                            ["762/12/18" 24000]
                            ["762/12/20" 35000]
                            ["762/12/24" 2500000]
                            ["763/5/7" 3000000]
                            ["764/8/7" 3200000]
                            ["767/5/12" 800000000]
                            ["767/5/16" 27000000000]
                            ["767/5/26" 40000000000]
                            ["774/5/8" 300000000000]
                            ["784/5/7" 300000000000]]]
                 ["gohan" [["757/5/7" 1]
                           ["761/10/12" 13070]
                           ["762/4/29" 20000]
                           ["762/11/3" 15000]
                           ["762/12/18" 3500]
                           ["762/12/24" 1600000]
                           ["764/8/7" 900000]
                           ["767/5/12" 750000000]
                           ["767/5/26" 360000000000]
                           ["774/4/7" 135000000000]
                           ["774/5/7" 280000000000]
                           ["774/5/8" 60000000000000]
                           ["784/5/7" 80000000000000]]]
                 ["kuririn" [["736/5/7" 1]
                             ["740/5/7" 1]
                             ["749/9/10" 5.9]
                             ["750/5/7" 70]
                             ["750/5/9" 72]
                             ["750/5/12" 73]
                             ["753/5/7" 240]
                             ["756/5/7" 400]
                             ["761/10/12" 412]
                             ["762/5/7" 938]
                             ["762/11/3" 1770]
                             ["762/12/18" 1900]
                             ["762/12/24" 75000]
                             ["763/5/3" 75000]
                             ["763/10/7" 75000]
                             ["764/8/7" 80000]
                             ["767/5/7" 1300000]
                             ["784/5/7" 1300000]]]
                 ["freezer" [["732/5/7" 530000]
                             ["737/5/7" 530000]
                             ["762/12/24" 120000000]
                             ["764/8/7" 160000000]]]
                 ["cell" [["763/5/7" 1]
                          ["764/5/7" 5200000]
                          ["767/5/12" 400000000]
                          ["767/5/16" 45000000000]
                          ["767/5/26" 180000000000]]]
                 ["buu" [["732/5/7" 1000000000000]
                         ["774/5/7" 1000000000000]
                         ["774/5/8" 36000000000000]
                         ["774/5/9" 400000000000]
                         ["784/5/7" 400000000000]]]])

(defn make-map-seq [data]
  (map #(array-map :age (get % 0) :power (get % 1)) data))

(defn sensi-map [data]
  (apply merge (map #(array-map (keyword (get % 0)) (make-map-seq (get % 1))) data)))

(def zsensi (sensi-map sensi-data))

(defn all-sensi []
  zsensi)
