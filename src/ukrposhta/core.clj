(ns ukrposhta.core
  (require [clj-webdriver.taxi :refer :all])
  (:gen-class))

(defn search [id]
  (quick-fill-submit {"#ctl00_centerContent_txtBarcode" id}
                     {"#ctl00_centerContent_btnFindBarcodeInfo" submit}))

(defn print-info [id]
  (set-driver! {:browser :htmlunit} "http://services.ukrposhta.ua/bardcodesingle/Default.aspx")
  (search id)
  (println (text (element "#ctl00_centerContent_divInfo"))))

(defn -main [& args]
  (let [id (first args)]
     (if id
       (print-info id)
       (println "Usage: java -jar ukrposhta-uber.jar <id>"))))