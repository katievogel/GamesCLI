(ns main.r-p-s)

(def score
  {"rock" {"rock" :tie
           "paper" :two
           "scissors" :one}
   "paper" {"rock" :one
            "paper" :tie
            "scissors" :two}
   "scissors" {"rock" :tie
               "paper" :two
               "scissors" :one}})

(defn rps [x y]
  (case (get (get score x) y)
    :tie (str "Tie! Both players threw " x)
    :one (str "Player 1 wins!" x " beats " y)
    :two (str "Player 2 wins!" y " beats " x)))



