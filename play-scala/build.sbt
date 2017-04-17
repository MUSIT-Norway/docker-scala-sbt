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
val akkaVersion = "2.4.17"
val akkaHttpVersion = "10.0.2"
val playSlick2Version = "2.0.2"
val slick2Version = "2.1.0"
val playSlick3Version = "2.1.0"
val slick3Version = "3.2.0"
val logbackVersion = "1.1.7"
val slf4jVersion = "1.7.21"
val pgsqlJDBC41Version = "9.4-1201-jdbc41"
val pgsqlJDBC42Version = "42.0.0"
val scalatestVersion = "2.2.6"
val scalatestplusVersion = "1.5.1"
val specs2Version = "3.8.9"
val casbahVersion = "3.1.1"
val playReactiveMongoVersion = "0.12.1"
val reactiveMongoVersion = "0.12.1"
val silhouetteVersion = "4.0.0"
val ficusVersion = "1.4.0"
val scalaGuiceVersion = "4.1.0"
val h2Version = "1.4.193"

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
  "org.scalatest" %% "scalatest" % scalatestVersion % Test,
  "org.scalactic" %% "scalactic" % scalatestVersion,
  "org.scalatestplus.play" %% "scalatestplus-play" % scalatestplusVersion % Test,
  "com.typesafe.play" %% "play-slick" % playSlick2Version,
  "com.typesafe.play" %% "play-slick" % playSlick3Version,
  "com.typesafe.play" %% "play-slick-evolutions" % playSlick2Version,
  "com.typesafe.slick" %% "slick" % slick2Version,
  "com.typesafe.slick" %% "slick" % slick3Version,
  "org.postgresql" % "postgresql" % pgsqlJDBC41Version,
  "org.postgresql" % "postgresql" % pgsqlJDBC42Version,
  "ch.qos.logback" % "logback-classic" % logbackVersion,
  "org.mongodb" %% "casbah-commons" % casbahVersion,
  "org.mongodb" %% "casbah-core"    % casbahVersion,
  "org.mongodb" %% "casbah-query"   % casbahVersion,
  "org.mongodb" %% "casbah-gridfs"  % casbahVersion,
  "org.reactivemongo" %% "play2-reactivemongo" % playReactiveMongoVersion,
  "org.reactivemongo" %% "reactivemongo" % reactiveMongoVersion,
  "com.iheart" %% "ficus" % ficusVersion,
  "net.codingwell" %% "scala-guice" % scalaGuiceVersion,
  "com.mohiva" %% "play-silhouette" % silhouetteVersion,
  "com.mohiva" %% "play-silhouette-password-bcrypt" % silhouetteVersion,
  "com.mohiva" %% "play-silhouette-crypto-jca" % silhouetteVersion,
  "com.mohiva" %% "play-silhouette-persistence" % silhouetteVersion,
  "com.mohiva" %% "play-silhouette-cas" % silhouetteVersion,
  "com.mohiva" %% "play-silhouette-persistence-reactivemongo" % silhouetteVersion,
  "com.mohiva" %% "play-silhouette-testkit" % silhouetteVersion % Test
)

libraryDependencies ++= Seq("slf4j-api", "jul-to-slf4j", "jcl-over-slf4j").map("org.slf4j" % _ % slf4jVersion)
