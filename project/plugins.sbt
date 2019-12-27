addSbtPlugin("com.typesafe.sbt" % "sbt-native-packager" % "1.5.2")
addSbtPlugin("io.spray" % "sbt-revolver" % "0.9.1")
addSbtPlugin("au.com.onegeek" %% "sbt-dotenv" % "2.0.143")
addSbtPlugin("org.scalameta" % "sbt-scalafmt" % "2.0.7")
addSbtPlugin("com.tapad" % "sbt-docker-compose" % "1.0.34")
addSbtPlugin("com.github.gseitz" % "sbt-release" % "1.0.11")
addSbtPlugin("com.itv" % "sbt-scalapact" % "2.3.12")

addSbtPlugin("com.frugalmechanic" % "fm-sbt-s3-resolver" % "0.19.0")

resolvers += Resolver.url("sbts3 ivy resolver", url("https://dl.bintray.com/emersonloureiro/sbt-plugins"))(
  Resolver.ivyStylePatterns
)
addSbtPlugin("cf.janga" % "sbts3" % "0.10.3")
