libraryDependencies += "org.scala-sbt" % "scripted-plugin" % sbtVersion.value

addSbtPlugin("com.typesafe.sbt" % "sbt-scalariform" % "1.3.0")

resolvers += "jgit-repo" at "http://download.eclipse.org/jgit/maven"

addSbtPlugin("com.typesafe.sbt" % "sbt-git" % "0.6.4")

resolvers += Resolver.url(
  "bintray-sbt-plugin-releases",
    url("http://dl.bintray.com/content/sbt/sbt-plugin-releases"))(
        Resolver.ivyStylePatterns)

addSbtPlugin("me.lessis" % "bintray-sbt" % "0.1.2")
