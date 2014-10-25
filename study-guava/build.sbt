import _root_.sbt.Keys._

organization := "myStudy"

name := "study-guava"

version := "1.0-SNAPSHOT"

scalaVersion := "2.11.1"

libraryDependencies ++= Seq(
  "com.google.guava" % "guava" % "18.0",
  "org.apache.commons" % "commons-lang3" % "3.3.2",
  "com.typesafe.akka" % "akka-actor_2.10" % "2.3.6"
)