scalaVersion := "3.3.4"

name := "winterthur-lsp"
organization := "org.objectpascalcommunity"
version := "0.0.1"

libraryDependencies ++= Seq(
  "org.scala-lang.modules" %% "scala-parser-combinators" % "2.3.0",
  "org.eclipse.lsp4j" % "org.eclipse.lsp4j" % "0.23.1",
  "org.scalatest" %% "scalatest" % "3.2.9" % Test
)
