(defproject one "1.0.0-SNAPSHOT"
  :description "Getting Started with ClojureScript."
  :dependencies [[org.clojure/clojure "1.5.1"]
                 [ring "1.2.0"]
                 [compojure "1.1.5"]
                 [enlive "1.1.1"]
                 [org.mozilla/rhino "1.7R3"]
                 [com.google.javascript/closure-compiler "r1592"]
                 [org.clojure/google-closure-library "0.0-790"]]
  :dev-dependencies [[jline "2.10"]
                     [marginalia "0.7.1"]
                     [lein-marginalia "0.7.1"]]
  :repl-options {:init-ns one.sample.repl}
  :source-paths ["src/clj"
                 "src/cljs"
                 "src/app/clj"
                 "src/app/cljs"
                 "src/app/shared"
                 "src/app/cljs-macros"
                 "src/lib/clj"
                 "src/lib/cljs"]
  :resource-paths ["templates"]
  :aliases {"dumbrepl" ["trampoline" "run" "-m" "clojure.main/main"]})
