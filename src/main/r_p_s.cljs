(ns main.r-p-s)

(def score
  {"rock"     {"rock"     [:tie "Tie! Both players threw rock!"]
               "paper"    [:two "Player 2 wins! Paper covers rock!"]
               "scissors" [:one "Player 1 wins! Rock smashes scissors!"]}
   "paper"    {"rock"     [:one "Player 1 wins! Paper covers rock!"]
               "paper"    [:tie "Tie! Both players threw paper!"]
               "scissors" [:two "Player 2 wins! Scissors cuts paper!"]}
   "scissors" {"rock"     [:two "Player 2 wins! Rock smashes scissors!"]
               "paper"    [:one "Player 1 wins! Scissors cuts paper!"]
               "scissors" [:tie "Tie! Both players threw scissors!"]}})

(defn rps [x y]
  (let [[winner reason] (get (get score x) y)]
    (case winner
      :tie (str reason)
      :one (str reason)
      :two (str reason))))

; case insensitivity on inputs????

