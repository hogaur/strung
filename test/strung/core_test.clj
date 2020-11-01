(ns strung.core-test
  (:require [clojure.test :refer :all]
            [strung.core :refer :all]))

(deftest string-equals-string-test
  (testing "That a string is equal to itself"
    (is (strequals? "string" "string"))))

(deftest string-not-equals-string-test
  (testing "That a string is not equal to strong"
    (is (not (strequals? "string" "strong")))))
