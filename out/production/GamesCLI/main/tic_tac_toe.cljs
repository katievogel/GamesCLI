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



; 1
(def s "ooo,xnx,nxn")
(str/split s #",") := ["ooo" "xnx" "nxn"]

(rest (str/split "xnx" #"")) := '("x" "n" "x")

(keyword "x") := :x

(mapv keyword '("x" "n" "x")) ... := [:x :n :x]

; 2
"xnx" := [:x :n :x]
;3
["ooo" "xnx" "nxn"] := [[:x :x :o]
                        [:x :o :n]
                        [:n :o :o]]

; 4

 ;assoc the ttt string into board map, EX. ooo,xnx,nxn, where n is nil/blank
 ; and the commas split each row
 ;case or if statements, maybe when, to evaluate win conditions above
 ;result should print winner X or O

;parse string to board
(defn parse-input [s]
  (let [split-comma (str/split s #",")]
    (println "1" (pr-str split-comma))
    (mapv (fn [xyz]
            (println "2" (pr-str xyz))
            (mapv (fn [c] (keyword c)) (rest (str/split xyz #"")))) split-comma)))

(defn check-victory-condition? [board]
  (if ) false)

;check for victory conditions
(defn ttt [s]
  (let [board (parse-input s)]
    (check-victory-condition? board)))

;(defn check-winner [board pattern]
;  (set [(get-in board [0 0])
;        (get-in board [0 1])
;        (get-in board [0 2])]))
;
;; possible victory condition patterns
;[[0 0] [0 1] [0 2]]
;[[0 0] [1 1] [2 2]]
;[[0 0] [1 0] [2 0]]


(set ([(get-in board [0 0]) (get-in board [0 1]) (get-in board [0 2])]
      [(get-in board [1 0]) (get-in board [1 1]) (get-in board [2 2])]
      [(get-in board [2 0]) (get-in board [2 1]) (get-in board [2 2])]
      [(get-in board [0 0]) (get-in board [1 0]) (get-in board [2 0])]
      [(get-in board [0 1]) (get-in board [1 1]) (get-in board [2 1])]
      [(get-in board [0 2]) (get-in board [1 2]) (get-in board [2 2])]
      [(get-in board [0 2]) (get-in board [1 1]) (get-in board [2 1])]
      [(get-in board [0 0]) (get-in board [1 1]) (get-in board [2 2])]))










