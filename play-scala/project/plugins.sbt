resolvers += Resolver.typesafeRepo("releases")
resolvers += Resolver.typesafeRepo("snapshots")
resolvers += Resolver.sonatypeRepo("releases")
//resolvers += Resolver.

// Coursier dependency resolver
addSbtPlugin("io.get-coursier" %% "sbt-coursier" % "1.0.0-RC1")

// Framework plugins
addSbtPlugin("com.typesafe.play" % "sbt-plugin"   % "2.5.14")
addSbtPlugin("org.scala-js"      % "sbt-scalajs"  % "0.6.14")

// Formatting and style checking
addSbtPlugin("com.geirsson"    % "sbt-scalafmt"           % "0.6.3")
addSbtPlugin("org.scalastyle"  %% "scalastyle-sbt-plugin" % "0.8.0")

addSbtPlugin("com.timushev.sbt" % "sbt-updates" % "0.3.0")

// Code Coverage plugins
addSbtPlugin("org.scoverage" % "sbt-scoverage"       % "1.5.0")
addSbtPlugin("com.codacy"    % "sbt-codacy-coverage" % "1.3.4")

// Native packaging plugin
addSbtPlugin("com.typesafe.sbt" %% "sbt-native-packager" % "1.2.0-M8")

