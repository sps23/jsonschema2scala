name := "jsonschema2scala"

version := "0.1"

scalaVersion := "2.12.10"

libraryDependencies ++= Seq(
  "com.beachape" %% "enumeratum" % "1.5.13",
  "org.json4s" %% "json4s-jackson" % "3.6.7",
  "org.scalactic" %% "scalactic" % "3.0.1",
  "org.scalatest" %% "scalatest" % "3.0.1" % "test"
)