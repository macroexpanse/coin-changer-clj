(ns coin-changer.core)

(def coins
  {1 0, 5 0, 10 0, 25 0, 100 0})

(defn make-change [cents]
  (loop [i        1
         coins (into (sorted-map) coins)
         cents cents]
     (if (= cents 0)
       coins
      (let [denom (nth (keys coins) (- (count coins) i))
            denom-count (quot cents denom)]
      (recur (inc i) (assoc coins denom denom-count) (- cents (* denom denom-count)))))))

