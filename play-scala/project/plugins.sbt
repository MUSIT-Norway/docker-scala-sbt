resolvers ++= DefaultOptions.resolvers(snapshot = true)
resolvers += Resolver.typesafeRepo("releases")
resolvers += Resolver.sonatypeRepo("releases")

// Coursier dependency resolver
addSbtPlugin("io.get-coursier" % "sbt-coursier" % "1.0.0-M15-1")

// The Play plugin
addSbtPlugin("com.typesafe.play" % "sbt-plugin" % "2.5.12")

// Formatting and style checking
addSbtPlugin("org.scalariform" % "sbt-scalariform" % "1.6.0")
addSbtPlugin("org.scalastyle" %% "scalastyle-sbt-plugin" % "0.8.0")

addSbtPlugin("com.timushev.sbt" % "sbt-updates" % "0.3.0")

// Code Coverage plugins
addSbtPlugin("org.scoverage" % "sbt-scoverage" % "1.5.0")
addSbtPlugin("com.codacy" % "sbt-codacy-coverage" % "1.3.4")

// Native packaging plugin
addSbtPlugin("com.typesafe.sbt" %% "sbt-native-packager" % "1.1.4")

