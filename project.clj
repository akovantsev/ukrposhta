(defproject ukrposhta "0.1.0-SNAPSHOT"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :description "Print UkrPoshta's package tracking information by package's barcode id."
  :author "Misha Akovantsev"
  :dependencies [[org.clojure/clojure "1.6.0"]
                 [clj-webdriver "0.6.1"]]
  :auto-clean true
  :uberjar-name "ukrposhta-uber.jar"
  :aot  [ukrposhta.core]
  :main ukrposhta.core)
