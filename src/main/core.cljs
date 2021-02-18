(ns main.core
  (:require #_[main.calculator]
            [main.even-or-odd]
            [main.fizzbuzz]
            #_[main.go-engine]
            #_[main.r-p-s]
            #_[main.tic-tac-toe]))

(defn init! [game-id x]
  (println "args:" x)
  #_(main.calculator)

  (case game-id
    "even-or-odd"
    (println (main.even-or-odd/is-even-or-odd x))
    "fizzbuzz"
    (println (main.fizzbuzz/fizzbuzz x)))

  #_(println (main.even-or-odd/is-even-or-odd x))

  #_(main.go-engine)
  #_(main.r-p-s)
  #_(main.tic-tac-toe))