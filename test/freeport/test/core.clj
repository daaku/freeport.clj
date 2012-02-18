(ns freeport.test.core
  "Test freeport functionality."
  {:author "Naitik Shah"}
  (:use
    [freeport.core :only [get-free-port!]]
    [clojure.test :only [deftest testing is]]))

(deftest get-free-port-test
  (let [port (get-free-port!)]
    (is port)))
