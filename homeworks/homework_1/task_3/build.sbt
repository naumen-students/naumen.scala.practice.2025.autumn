ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "2.13.12"

lazy val root = (project in file("."))
  .settings(
    name := "Naumen12"
  )
libraryDependencies += "org.scala-lang.modules" %% "scala-parser-combinators" % "1.1.2"