name := "hello"

version := "0.1"

organization := "org.my"

scalaVersion := "2.12.4"

sbtVersion := "1.0.4"

libraryDependencies ++= Seq(
  "com.softwaremill.sttp" %% "core" % "1.1.2",
  "org.scalatest" %% "scalatest" % "3.0.4" % "test"
)