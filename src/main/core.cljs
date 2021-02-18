(ns main.core
  (:require #_[main.calculator]
            [main.even-or-odd]
            #_[main.fizzbuzz]
            #_[main.go-engine]
            #_[main.r-p-s]
            #_[main.tic-tac-toe]))

(defn init! [x]
  (println "args:" x)
  #_(main.calculator)
  (println (main.even-or-odd/is-even-or-odd x))
  #_(main.fizzbuzz)
  #_(main.go-engine)
  #_(main.r-p-s)
  #_(main.tic-tac-toe))