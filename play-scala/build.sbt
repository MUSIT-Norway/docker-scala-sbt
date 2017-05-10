import com.typesafe.sbt.SbtNativePackager
import com.typesafe.sbt.SbtNativePackager.autoImport._
import com.typesafe.sbt.packager.docker.DockerPlugin
import com.typesafe.sbt.packager.docker.DockerPlugin.autoImport._
import sbt.Keys._
import sbt._
import scoverage.ScoverageKeys._

name := """play-scala"""

version := "1.0-SNAPSHOT"

lazy val root = (project in file("."))
  .enablePlugins(PlayScala, SbtNativePackager, DockerPlugin)

scalaVersion := "2.11.8"

PlayKeys.playOmnidoc := false

coverageFailOnMinimum := false

resolvers ++= Seq(
    Resolver.bintrayRepo("scalaz", "releases"),
    Resolver.typesafeRepo("releases"),
    Resolver.jcenterRepo
  )

val playVersion = play.core.PlayVersion.current
val akkaVersion = "2.4.18"
val akkaHttpVersion = "10.0.6"
val playSlick3Version = "2.1.0"
val slick3Version = "3.2.0"
val logbackVersion = "1.2.3"
val slf4jVersion = "1.7.25"
val scalatestVersion = "3.0.1"
val scalatestplusVersion = "2.0.0"
val scalaMockVersion = "3.5.0"
val ficusVersion = "1.4.0"
val scalaGuiceVersion = "4.1.0"
val h2Version = "1.4.194"
val zxingVersion = "3.3.0"
val enumeratumVersion = "1.5.10"
val playVersion = play.core.PlayVersion.current

libraryDependencies ++= Seq(
  jdbc,
  cache,
  ws,
  json,
  "com.typesafe.akka" %% "akka-actor" % akkaVersion,
  "com.typesafe.akka" %% "akka-agent" % akkaVersion,
  "com.typesafe.akka" %% "akka-camel" % akkaVersion,
  "com.typesafe.akka" %% "akka-cluster" % akkaVersion,
  "com.typesafe.akka" %% "akka-cluster-metrics" % akkaVersion,
  "com.typesafe.akka" %% "akka-cluster-sharding" % akkaVersion,
  "com.typesafe.akka" %% "akka-cluster-tools" % akkaVersion,
  "com.typesafe.akka" %% "akka-contrib" % akkaVersion,
  "com.typesafe.akka" %% "akka-http-core" % akkaVersion,
  "com.typesafe.akka" %% "akka-http-testkit" % akkaVersion,
  "com.typesafe.akka" %% "akka-multi-node-testkit" % akkaVersion,
  "com.typesafe.akka" %% "akka-osgi" % akkaVersion,
  "com.typesafe.akka" %% "akka-persistence" % akkaVersion,
  "com.typesafe.akka" %% "akka-persistence-tck" % akkaVersion,
  "com.typesafe.akka" %% "akka-remote" % akkaVersion,
  "com.typesafe.akka" %% "akka-slf4j" % akkaVersion,
  "com.typesafe.akka" %% "akka-stream" % akkaVersion,
  "com.typesafe.akka" %% "akka-stream-testkit" % akkaVersion,
  "com.typesafe.akka" %% "akka-testkit" % akkaVersion,
  "com.typesafe.akka" %% "akka-distributed-data-experimental" % akkaVersion,
  "com.typesafe.akka" %% "akka-typed-experimental" % akkaVersion,
  "com.typesafe.akka" %% "akka-http-core" % akkaHttpVersion,
  "com.typesafe.akka" %% "akka-http" % akkaHttpVersion,
  "com.typesafe.akka" %% "akka-http-testkit" % akkaHttpVersion,
  "com.typesafe.akka" %% "akka-http-spray-json" % akkaHttpVersion,
  "com.typesafe.akka" %% "akka-http-jackson" % akkaHttpVersion,
  "com.typesafe.akka" %% "akka-http-xml" % akkaHttpVersion,
  "com.typesafe.akka" %% "akka-persistence-query-experimental" % akkaVersion,
  "org.iq80.leveldb" % "leveldb" % "0.7",
  "org.fusesource.leveldbjni" % "leveldbjni-all" % "1.8",
  "com.h2database" % "h2" % h2Version,
  "org.scalatest" %% "scalatest" % scalatestVersion,
  "org.scalactic" %% "scalactic" % scalatestVersion,
  "org.scalatestplus.play" %% "scalatestplus-play" % scalatestplusVersion,
  "com.typesafe.play" %% "play-slick" % playSlick3Version,
  "com.typesafe.play" %% "play-slick-evolutions" % playSlick3Version,
  "com.typesafe.slick" %% "slick" % slick3Version,
  "ch.qos.logback" % "logback-classic" % logbackVersion,
  "com.iheart" %% "ficus" % ficusVersion,
  "net.codingwell" %% "scala-guice" % scalaGuiceVersion,
  "org.scalamock" %% "scalamock-scalatest-support" % scalaMockVersion,
  "com.google.zxing" % "core" % zxingVersion,
  "com.google.zxing" % "javase" % zxingVersion,
  "com.typesafe.play" %% "play-slick" % playSlickVersion,
  "com.typesafe.play" %% "play-slick-evolutions" % playSlickVersion,
  "com.typesafe.play" %% "play-jdbc" % playVersion,
  "com.typesafe.play" %% "play-cache" % playVersion,
  "com.typesafe.play" %% "play-ws" % playVersion,
  "com.typesafe.play" %% "play-json" % playVersion,
  "com.typesafe.play" %% "play-logback" % playVersion
)
libraryDependencies ++= {
  val libs = Seq("enumeratum", "enumeratum-play", "enumeratum-play-json")
  libs.map("com.beachape" %% _ % enumeratumVersion)
}
libraryDependencies ++= Seq("slf4j-api", "jul-to-slf4j", "jcl-over-slf4j").map("org.slf4j" % _ % slf4jVersion)
