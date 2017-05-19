organization := "example"
name := "$name$"

scalaVersion := "$scala_version$"

libraryDependencies ++= Seq(
  "org.scalatest" %% "scalatest" % "$scalatest_version$" % Test
)

scalacOptions ++= Seq(
  "-language:_",
  "-deprecation",
  "-encoding", "UTF-8", // yes, this is 2 args
  "-feature",
  "-unchecked",
  "-Xfatal-warnings",
  "-Xlint",
  "-Yno-adapted-args",
  "-Ywarn-dead-code"
)