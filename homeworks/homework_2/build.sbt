ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "3.3.6"


libraryDependencies += "com.lihaoyi" %% "utest" % "0.9.1" % Test
testFrameworks += new TestFramework("utest.runner.Framework")

lazy val root = (project in file("."))
  .settings(
    name := "lesson2"
  )