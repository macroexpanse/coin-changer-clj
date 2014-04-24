(ns coin-changer.core-spec
  (:require [coin-changer.core :refer :all])
  (:require [speclj.core :refer :all]))

(describe "coin-changer"
  (it "returns one penny for one cent change"
      (should= {1 1, 5 0, 10 0, 25 0, 100 0} (make-change 1)))

  (it "returns two pennies for two cent change"
      (should= {1 2, 5 0, 10 0, 25 0, 100 0} (make-change 2)))

  (it "returns one nickel for five cent change"
      (should= {1 0, 5 1, 10 0, 25 0, 100 0} (make-change 5)))

  (it "returns one nickel and one penny for six cent change"
      (should= {1 1, 5 1, 10 0, 25 0, 100 0} (make-change 6)))

  (it "returns one nickel and four pennies for nine cent change"
      (should= {1 4, 5 1, 10 0, 25 0, 100 0} (make-change 9)))

  (it "returns one dime for ten cent change"
      (should= {1 0, 5 0, 10 1, 25 0, 100 0} (make-change 10)))

  (it "returns one dime and one penny for eleven cent change"
      (should= {1 1, 5 0, 10 1, 25 0, 100 0} (make-change 11)))

  (it "returns one dime and one nickel for fifteen cent change"
      (should= {1 0, 5 1, 10 1, 25 0, 100 0} (make-change 15)))

  (it "returns one dime, one nickel, and four pennies for ninetenn cent change"
      (should= {1 4, 5 1, 10 1, 25 0, 100 0} (make-change 19)))

  (it "returns one quarter for twenty-five cent change"
      (should= {1 0, 5 0, 10 0, 25 1, 100 0} (make-change 25)))

  (it "returns two quarters, one dime, one nickel, and three pennies for sixty-eight cent change"
      (should= {1 3, 5 1, 10 1, 25 2, 100 0} (make-change 68)))

  (it "returns one dollar, three quarters, one dime, one nickel, and four pennies for $1.94 change"
      (should= {1 4, 5 1, 10 1, 25 3, 100 1} (make-change 194))))


