(ns main.even-or-odd)

(defn is-even-or-odd [x]
  (if (= 0 (mod x 2))
    "even"
    "odd"))
