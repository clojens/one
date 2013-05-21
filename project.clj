(defproject one "1.0.0-SNAPSHOT"
  :description "Getting Started with ClojureScript."
  :dependencies [[org.clojure/clojure "1.5.1"]
                 [ring "1.1.8"]
                 [compojure "1.1.5"]
                 [enlive "1.0.1"]
                 [org.mozilla/rhino "1.7R3"]
                 [com.google.javascript/closure-compiler "r1592"]
                 [org.clojure/google-closure-library "0.0-790"]]
  :dev-dependencies [[jline "2.10"]
                     [marginalia "0.7.1"]
                     [lein-marginalia "0.7.1"]]
  ;:git-dependencies [["https://github.com/clojure/clojurescript.git"
  ;                    "886d8dc81812962d30a741d6d05ce9d90975160f"]
  ;                   ["https://github.com/levand/domina.git"
  ;                   "8933b2d12c44832c9bfaecf457a1bc5db251a774"]]
  :repl-init one.sample.repl
  :source-path "src/app/clj"
  :extra-classpath-dirs [".lein-git-deps/clojurescript/src/clj"
                         ".lein-git-deps/clojurescript/src/cljs"
                         ".lein-git-deps/domina/src/cljs"
                         "src/app/cljs"
                         "src/app/cljs-macros"
                         "src/lib/clj"
                         "src/lib/cljs"
                         "templates"])
