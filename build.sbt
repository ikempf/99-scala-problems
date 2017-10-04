import Dependencies._

lazy val root = (project in file(".")).
  settings(
    organization := "com.ikempf",
    scalaVersion := "2.12.3",
    version := "0.1.0-SNAPSHOT",
    name := "99-scala-problems",
    libraryDependencies += shapeless,
    libraryDependencies += cats,
    libraryDependencies += scalaTest % Test
  )