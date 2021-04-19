name := "jsonschema2scala"

version := "2.0"

ThisBuild / scalaVersion := "2.13.5"
//ThisBuild / scalaVersion := "3.0.0-RC2"

libraryDependencies ++= Seq(
  ("com.beachape" %% "enumeratum"     % "1.6.1"), //.cross(CrossVersion.for3Use2_13),
  ("org.json4s"   %% "json4s-jackson" % "3.6.10"), //.cross(CrossVersion.for3Use2_13),
  "org.scalactic" %% "scalactic"      % "3.2.7",
  "org.scalatest" %% "scalatest"      % "3.2.7" % "test"
)

//scalacOptions ++= Seq("-target:jvm-11", "-Xsource:3")

javacOptions ++= Seq("-source", "11", "-target", "11")
