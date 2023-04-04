
lazy val `Computing-the-Square-Root-of-a-Value` = (project in file("."))
  .settings(
    Compile / scalaSource := baseDirectory.value / "src",
    Test / scalaSource := baseDirectory.value / "test",
    libraryDependencies += "org.scalatest" %% "scalatest" % "3.2.15"
  )
