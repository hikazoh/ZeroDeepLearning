(ns sec2
  (:require [org.apache.clojure-mxnet.ndarray :as ndarray]))

(defn AND[x1 x2]
  (let [x (ndarray/array [x1 x2][2 1])
        w (ndarray/array [0.5 0.5][2 1])
        b -0.7
        a (apply + b (ndarray/->vec (ndarray/* x w)) )]
    (if (<= a 0)
      0
      1
      )
    )
  )

(defn NAND[x1 x2]
  (let [x (ndarray/array [x1 x2][2 1])
        w (ndarray/array [-0.5 -0.5][2 1])
        b 0.7
        a (apply + b (ndarray/->vec (ndarray/* x w)))]
    (if (<= a 0)
      0
      1)
    )
  )

(defn OR[x1 x2]
  (let [x (ndarray/array [x1 x2][2 1])
        w (ndarray/array [0.5 0.5][2 1])
        b -0.2
        a (apply + b (ndarray/->vec (ndarray/* x w)))]
    (if (<= a 0)
      0
      1)
    )
  )

(defn XOR[x1 x2]
  (let [s1 (NAND x1 x2)
        s2 (OR x1 x2)]
    (AND s1 s2)))

