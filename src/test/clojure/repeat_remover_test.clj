(ns repeat-remover-test
    (:require [clojure.test :refer [deftest is]])
    (:import (org.example.testing RepeatRemover)))

(deftest repeat-remover-static-test
         (is (= "abc" (RepeatRemover/staticRemove "aabcc"))))

(deftest repeat-remover-instance-test
  (is (= "abc" (.remove (RepeatRemover.) "aabbcc"))))
