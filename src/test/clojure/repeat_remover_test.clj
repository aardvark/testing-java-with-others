(ns repeat-remover-test
    (:require [clojure.test :refer [deftest is]])
  (:import (org.example.testing RepeatRemover)
           (org.junit.jupiter.api Assertions))
    (:gen-class
      :name org.example.testing.RepeatRemoverClojureTest
      :main false
      :methods [[^{org.junit.jupiter.api.Test {}}
                 testStaticCall [] void]
                [^{org.junit.jupiter.api.Test {}}
                 testInstanceCall [] void]]
      :prefix "")
  )

(def subj (RepeatRemover.))

(defn testStaticCall [this]
  (Assertions/assertEquals "ABC" (RepeatRemover/staticRemove "AABCC")))

(defn testInstanceCall [this]
  (Assertions/assertEquals "ABC" (.remove subj "AABCC")))
