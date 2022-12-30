version := "0.1.0-SNAPSHOT"

scalaVersion := "2.13.10"

lazy val root = (project in file("."))
  .settings(
    name := "mstt-scala"
  )
libraryDependencies +=
  "com.typesafe.akka" %% "akka-actor" % "2.7.0"

//libraryDependencies += "com.typesafe.akka" % "akka-actor_2.10" % "2.2-M1"
