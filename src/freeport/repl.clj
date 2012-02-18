(ns freeport.repl
  "repl helpers"
  {:author "Naitik Shah"}
  (:require
    [auto-reload.core]
    [clojure.tools.logging])
  (:use
    [freeport.core]))

(auto-reload.core/auto-reload ["src"])
