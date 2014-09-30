(defproject circularuins "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.6.0"]
                 [ring/ring-core "1.3.0"]
                 [ring/ring-jetty-adapter "1.3.0"]
                 [compojure "1.1.8"]
                 [cheshire "5.3.1"]
                 [org.clojure/clojurescript "0.0-2156"]]
  :dev-dependencies [[ring/ring-devel "1.3.0"]]
  :plugins [[lein-ring "0.8.11"]
            [lein-cljsbuild "1.0.2"]]
  :main circularuins.core
  :aot [circularuins.core]
  :ring {:handler circularuins.core/app}
  :profiles {:dev {:dependencies [[ring-mock "0.1.5"]]}}
  ; clojurescriptのビルド関連
  :hooks [leiningen.cljsbuild]
  :cljsbuild {
    :builds {
      :main {
        :source-paths ["src/cljs"]
        :compiler {:output-to "resources/public/demo/cljs.js"
                   :optimizations :simple
                   :pretty-print true}
        :jar true}}}
  )
