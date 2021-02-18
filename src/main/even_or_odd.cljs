(ns main.even-or-odd)

(defn foo [] (println "foo"))

(defn is-even-or-odd [x]
  (case (mod x 2)
    1 "odd"
    0 "even")

  #_(if mod (x 0) "even" "odd"))
