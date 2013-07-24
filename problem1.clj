;; If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.
;; Find the sum of all the multiples of 3 or 5 below 1000.

(def take-3
  (take-nth 3 (range 0 1000)))

(def take-5
  (take-nth 5 (range 0 1000)))

(def take-15
  (take-nth 15 (range 0 1000)))

(println (- (reduce + (concat take-3 take-5)) (reduce + take-15)))