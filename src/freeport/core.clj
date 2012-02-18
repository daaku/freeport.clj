(ns freeport.core
  "<a href='http://travis-ci.org/nshah/freeport.clj'>
  <img src='https://secure.travis-ci.org/nshah/freeport.clj.png'>
  </a>

  Get a free port on the system.

    git clone https://github.com/nshah/freeport.clj
    cd freeport.clj
    lein repl

  Get a free port:

    (get-free-port!)

  Returns some integer port:

    4242"
  {:author "Naitik Shah"}
  (:import
    [java.net ServerSocket]))

(defn get-free-port!
  "Get a free port on the system."
  []
  (let [socket (ServerSocket. 0)
        port (.getLocalPort socket)]
    (.close socket)
    port))
