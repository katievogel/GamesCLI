(ns main.tic-tac-toe
  (:require
    [clojure.string :as str]))

;columns 1,2,3
;rows a,b,c
;(let board {:a1 ; wins are a1=b1=c1, a1=b2=c3, a1=a2=a3
;            :b1 ; wins are a1=b1=c1, b1=b2=b3
;            :c1 ; wins are a1=b1=c1, a3=b2=c1, c1=c2=c3
;            :a2 ; wins are a1=a2=a3, a2=b2=c2
;            :b2 ; wins are a1=b2=c3, b1=b2=b3, a3=b2=c1, a2=b2=c2
;            :c2 ; wins are a2=b2=c2, c1=c2=c3
;            :a3 ; wins are a1=a2=a3, a3=b2=c1, a3=b3=c3
;            :b3 ; wins are b1=b2=b3, a3=b3=c3
;            :c3}) ; wins are c1=c2=c3, a3=b3=c3, a1=b2=c3

 ;assoc the ttt string into board map, EX. ooo,xnx,nxn, where n is nil/blank
 ; and the commas split each row
 ;case or if statements, maybe when, to evaluate win conditions above
 ;result should print winner X or O

;parse string to board
(defn parse-input [s]
  ; split the string on ,
  (let [split-at-commas (str/split (str/split s #",") #"")]
    (map (fn [s] (keyword s)) split-at-commas))
  ; parse each one to :X :O nil and align with :a1 :a2 ...
  {:a1 :X
   :a2 :O
   :a3 nil})

(comment

  (defn f [x] ...)

  (f "xxo")
  [:x :x :o])


(defn check-victory-condition? [board]
  false)

;check for victory conditions
(defn ttt [s]
  (let [board (parse-input s)]
    (check-victory-condition? board)))





