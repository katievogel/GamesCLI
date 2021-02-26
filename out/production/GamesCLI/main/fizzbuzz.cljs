(ns main.fizzbuzz)

(defn fizzbuzz [x]
  (cond
    (and
      (= 0 (mod x 3))
      (= 0 (mod x 5))) "FizzBuzz"
    (= 0 (mod x 3)) "Fizz"
    (= 0 (mod x 5)) "Buzz"
    :else x))

;(defn fizzbuzz2 [x]
;
;  (let [fizz (= 0 (mod x 3))
;        buzz (= 0 (mod x 5))]
;    (cond
;      (and fizz buzz) "FizzBuzz"
;      fizz "Fizz"
;      buzz "Buzz"
;      :else x)))