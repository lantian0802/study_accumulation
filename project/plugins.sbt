import _root_.sbt.Keys._
import _root_.sbt.Level
import _root_.sbt._

// Comment to get more information during initialization
logLevel := Level.Warn

// The Typesafe repository 
resolvers += "Typesafe repository" at "http://repo.typesafe.com/typesafe/releases/"

// Use the Play sbt plugin for Play projects
addSbtPlugin("com.typesafe.play" % "sbt-plugin" % "2.3.4" exclude("org.scala-lang","scala-library"))

addSbtPlugin("com.typesafe.sbt" % "sbt-less" % "1.0.0" exclude("org.scala-lang","scala-library"))

addSbtPlugin("com.typesafe.sbt" % "sbt-coffeescript" % "1.0.0" exclude("org.scala-lang","scala-library"))

addSbtPlugin("net.virtual-void" % "sbt-dependency-graph" % "0.7.4")
