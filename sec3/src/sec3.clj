(ns sec3
  (:require [org.apache.clojure-mxnet.ndarray :as ndarray]
            [com.hypirion.clj-xchart :as c]))

(defn step-function[x]
  (if (> x 0)
    0
    1))
