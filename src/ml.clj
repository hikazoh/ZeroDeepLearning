(ns ml
  (:require [sec2 :as s2]))

(defn -main[& args]
  (println (map #(apply s2/AND %) [[0 0][0 1][1 0][1 1]]))
  (println (map #(apply s2/NAND %) [[0 0][0 1][1 0][1 1]]))
  (println (map #(apply s2/OR %) [[0 0][0 1][1 0][1 1]]))
  (println (map #(apply s2/XOR %) [[0 0][0 1][1 0][1 1]]))
  )
