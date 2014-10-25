import _root_.sbt._

organization := "myStudy"

name := """study_accumulation"""

version := "1.0"

scalaVersion := "2.11.1"

libraryDependencies += "org.scala-lang" % "scala-library" % "2.11.1"

lazy val study_guava = Project(id = "study-guava",base = file("study-guava"))

lazy val study_akka = Project(id = "study-akka",base = file("study-akka"))

lazy val root = Project(id = "study_accumulation",base = file(".")) aggregate(study_guava, study_akka)






