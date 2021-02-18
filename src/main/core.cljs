(ns main.core
  (:require #_[main.calculator]
            [main.even-or-odd]
            [main.fizzbuzz]
            #_[main.go-engine]
            [main.r-p-s]
            #_[main.tic-tac-toe]))

(defn init! [game-id x y]
  #_(println "args:" x)
  (case game-id
    "even-or-odd"
    (println (main.even-or-odd/is-even-or-odd x))
    "fizzbuzz"
    (println (main.fizzbuzz/fizzbuzz x))
    "rps"
    (println (main.r-p-s/rps x y))
    #_(main.calculator)
    #_(main.go-engine)
    #_(main.tic-tac-toe)))