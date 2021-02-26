(ns main.tic-tac-toe
  (:require
    [clojure.string :as str]))

;possible victory condition patterns
;[[0 0] [0 1] [0 2]]
;[[1 0] [1 1] [1 2]]
;[[2 0] [2 1] [2 2]]
;[[0 0] [1 0] [2 0]]
;[[0 1] [1 1] [2 1]]
;[[0 2] [1 2] [2 2]]
;[[0 2] [1 1] [2 0]]
;[[0 0] [1 1] [2 2]]
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

;parse string to board
(defn parse-input [s]
  (let [split-comma (str/split s #",")]
    (println "1" (pr-str split-comma))
    (mapv (fn [xyz]
            (println "2" (pr-str xyz))
            (mapv (fn [c] (keyword c)) (rest (str/split xyz #"")))) split-comma)))

(defn check-winner [board [A B C]]
  (set [(get-in board A)
        (get-in board B)
        (get-in board C)]))

(defn check-victory-condition? [board]
  (let [possible-solutions [(check-winner board [[0 0] [0 1] [0 2]])
                            (check-winner board [[1 0] [1 1] [1 2]])
                            (check-winner board [[2 0] [2 1] [2 2]])
                            (check-winner board [[0 0] [1 0] [2 0]])
                            (check-winner board [[0 1] [1 1] [2 1]])
                            (check-winner board [[0 2] [1 2] [2 2]])
                            (check-winner board [[0 2] [1 1] [2 0]])
                            (check-winner board [[0 0] [1 1] [2 2]])]]
   (filter (fn [item] (= 1 (count item))) possible-solutions)))


;check for victory conditions
(defn ttt [s]
  (let [board (parse-input s)]
    (check-victory-condition? board)))















