(ns main.core
  (:require [main.calculator]
            [main.even-or-odd]
            [main.fizzbuzz]
            [main.go-engine]
            [main.r-p-s]
            [main.tic-tac-toe]))

(defn init! [game-id x y]
  #_(println "args:" x)
  (case game-id
    "even-or-odd"
    (println (main.even-or-odd/is-even-or-odd x))
    "fizzbuzz"
    (println (main.fizzbuzz/fizzbuzz x))
    "rps"
    (println (main.r-p-s/rps x y))
    "calc add"
    (println (main.calculator/add x y))
    "calc subtract"
    (println (main.calculator/subtract x y))
    "calc multiply"
    (println (main.calculator/multiply x y))
    "calc divide"
    (println (main.calculator/divide* x y))
    "go"
    (println (main.go-engine/go))
    "ttt"
    (println (main.tic-tac-toe))
    nil
    (println "No command given.")))