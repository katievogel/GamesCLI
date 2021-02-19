(ns main.calculator)

;add
(defn add [x y]
  (+ (int x) (int y)))

;subtract
(defn subtract [x y]
  (- (int x) (int y)))

;multiply
(defn multiply [x y]
  (* (int x) (int y)))

;divide
(defn divide* [x y]
  (/ (int x) (int y)))

;can't run in command line without \ after calc