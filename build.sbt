name := "hello"

version := "0.1"

organization := "org.my"

scalaVersion := "2.12.4"

sbtVersion := "1.0.4"

resolvers ++= Seq(
  "ibiblio" at "http://mirrors.ibiblio.org/pub/mirrors/maven2",
  "Sonatype snapshots" at "https://oss.sonatype.org/content/repositories/snapshots/",
  "Sonatype releases" at "http://oss.sonatype.org/content/repositories/releases",
  "Scalaz Bintray Repo" at "http://dl.bintray.com/scalaz/releases"
)

libraryDependencies ++= Seq(
  "org.apache.commons" % "commons-lang3" % "3.7",
  "org.apache.commons" % "commons-io" % "1.3.2",
  "com.google.guava" % "guava" % "18.0",
  "org.scalaz" %% "scalaz-core" % "7.2.18",
  "ws.unfiltered" %% "unfiltered" % "0.9.1",
  "ws.unfiltered" %% "unfiltered-filter-async" % "0.9.1",
  "ws.unfiltered" %% "unfiltered-jetty" % "0.9.1",
  "org.commonjava.googlecode.markdown4j" % "markdown4j" % "2.2-cj-1.1",
  "com.github.spullara.mustache.java" % "compiler" % "0.9.5",
  "org.jsoup" % "jsoup" % "1.11.2",
  "org.scalactic" %% "scalactic" % "3.0.4",
  "ch.qos.logback" % "logback-classic" % "1.2.3",
  "com.typesafe.scala-logging" %% "scala-logging" % "3.7.2",
  "org.json4s" %% "json4s-native" % "3.5.3",
  "org.scalatest" %% "scalatest" % "3.0.4" % "test"
)