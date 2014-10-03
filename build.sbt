import com.typesafe.sbt.SbtGit._

organization := "com.gilt.sbt"

name := "sbt-newrelic"

sbtPlugin := true

scalacOptions ++= Seq("-deprecation", "-unchecked", "-feature")

addSbtPlugin("com.typesafe.sbt" % "sbt-native-packager" % "0.7.4")

ScriptedPlugin.scriptedSettings

scriptedLaunchOpts := { scriptedLaunchOpts.value ++
  Seq("-Xmx1024M", "-XX:MaxPermSize=256M", "-Dplugin.version=" + version.value)
}

scriptedBufferLog := false

versionWithGit

git.baseVersion := "0.0.4"
