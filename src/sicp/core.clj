(ns sicp.core)

(defn foo
  "I don't do a whole lot."
  [x]
  (println x "Hello, World!"))

(defn square
  [x]
  (* x x))


(defn sum-of-squares
  [x y]
  (+ (square x) (square y)))

(defn abs
  [x]
  (cond
   (< 0 x) x
   (> 0 x) (* x -1)))

(defn sum-of-three
  "Page 48. Exercise 1.3 Define a procedure that takes three numbers as arguments
   and returns the sum of the squares of the two larger numbers."
  [x y z]
  (let [[a b] (sort > [x y z])]
    (+ (square a) (square b) )))

(defn sqrt-iter
  [guess x]
  (new-if
      (good-enough? guess x) guess
      (sqrt-iter (improve guess x) x)))

(defn avg
  [x y]
  (/ (+ x y) 2))

(defn good-enough?
  [guess x]
  (< (abs (- (square guess) x)) 0.001))

(defn improve
  [guess x]
  (avg guess (/ x guess)))

(defn sqrt
  [x]
  (sqrt-iter 1 x))

(defn new-if
  [predicate then-clause else-clause]
  (cond
   predicate then-clause
   :else else-clause))
