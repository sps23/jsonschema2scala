name := "jsonschema2scala"

version := "2.0"

scalaVersion := "2.13.5"

libraryDependencies ++= Seq(
  "com.beachape"  %% "enumeratum"     % "1.6.1",
  "org.json4s"    %% "json4s-jackson" % "3.6.10",
  "org.scalactic" %% "scalactic"      % "3.2.3",
  "org.scalatest" %% "scalatest"      % "3.2.3" % "test"
)

Compile / mainClass := Some("jsonschema2scala.Main")
run / mainClass := Some("jsonschema2scala.Main")

addCompilerPlugin(
  "org.wartremover" %% "wartremover" % "2.4.13" cross CrossVersion.full
)
//wartremoverWarnings ++= Warts.unsafe

scalacOptions ++= Seq("-deprecation", "-Xlint", "-target:jvm-11")

javacOptions ++= Seq("-source", "11", "-target", "11")
