
lazy val `Lazy-Lists` = (project in file("."))
  .settings(
    Compile / scalaSource := baseDirectory.value / "src",
    Test / scalaSource := baseDirectory.value / "test",
    libraryDependencies ++= Seq(
      "org.scalatest"              %% "scalatest"                 % "3.2.15"
    )
  )