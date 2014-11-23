import _root_.sbt.Keys._

organization := "myStudy"

name := "study-sparkstreaming"

version := "1.0-SNAPSHOT"

scalaVersion := "2.10.4"

libraryDependencies += "org.apache.spark" % "spark-core_2.10" % "1.1.0" exclude("org.scala-lang","scala-library")

libraryDependencies += "org.apache.spark" % "spark-streaming_2.10" % "1.1.0" exclude("org.scala-lang","scala-library")

libraryDependencies += "org.slf4j" % "slf4j-api" % "1.7.7"

libraryDependencies += "org.slf4j" % "slf4j-log4j12" % "1.7.7"

libraryDependencies += "log4j" % "log4j" % "1.2.17"

