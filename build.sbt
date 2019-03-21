val scalaExercisesV = "0.4.0-SNAPSHOT"

lazy val `Primitive-Expressions` = (project in file("./Terms and Types/Primitive Expressions"))
  .settings(
    scalaSource in Compile := baseDirectory.value / "src", 
    scalaSource in Test := baseDirectory.value / "test",
    libraryDependencies += "org.scalatest" %% "scalatest" % "3.0.5"
  )

lazy val `Method-Calls` = (project in file("./Terms and Types/Method Calls"))
  .settings(
    scalaSource in Compile := baseDirectory.value / "src", 
    scalaSource in Test := baseDirectory.value / "test",
    libraryDependencies += "org.scalatest" %% "scalatest" % "3.0.5"
  )

lazy val `Operators` = (project in file("./Terms and Types/Operators"))
  .settings(
    scalaSource in Compile := baseDirectory.value / "src", 
    scalaSource in Test := baseDirectory.value / "test",
    libraryDependencies += "org.scalatest" %% "scalatest" % "3.0.5"
  )

lazy val `Common-Types` = (project in file("./Terms and Types/Common Types"))
  .settings(
    scalaSource in Compile := baseDirectory.value / "src", 
    scalaSource in Test := baseDirectory.value / "test",
    libraryDependencies += "org.scalatest" %% "scalatest" % "3.0.5"
  )

lazy val `Naming-Things` = (project in file("./Definitions and Evaluation/Naming Things"))
  .settings(
    scalaSource in Compile := baseDirectory.value / "src", 
    scalaSource in Test := baseDirectory.value / "test",
    libraryDependencies += "org.scalatest" %% "scalatest" % "3.0.5"
  )

lazy val `Naming-Things-2` = (project in file("./Definitions and Evaluation/Naming Things 2"))
  .settings(
    scalaSource in Compile := baseDirectory.value / "src", 
    scalaSource in Test := baseDirectory.value / "test",
    libraryDependencies += "org.scalatest" %% "scalatest" % "3.0.5"
  )

lazy val `Multiple-Parameters` = (project in file("./Definitions and Evaluation/Multiple Parameters"))
  .settings(
    scalaSource in Compile := baseDirectory.value / "src",
    scalaSource in Test := baseDirectory.value / "test",
    libraryDependencies += "org.scalatest" %% "scalatest" % "3.0.5"
  )

lazy val `Conditional-Expressions` = (project in file("./Functional Loops/Conditional Expressions"))
  .settings(
    scalaSource in Compile := baseDirectory.value / "src",
    scalaSource in Test := baseDirectory.value / "test",
    libraryDependencies += "org.scalatest" %% "scalatest" % "3.0.5"
  )

lazy val `Nested-Functions` = (project in file("./Lexical Scopes/Nested Functions"))
  .settings(
    scalaSource in Compile := baseDirectory.value / "src",
    scalaSource in Test := baseDirectory.value / "test",
    libraryDependencies += "org.scalatest" %% "scalatest" % "3.0.5"
  )

lazy val `Lexical-Scoping` = (project in file("./Lexical Scopes/Lexical Scoping"))
  .settings(
    scalaSource in Compile := baseDirectory.value / "src",
    scalaSource in Test := baseDirectory.value / "test",
    libraryDependencies += "org.scalatest" %% "scalatest" % "3.0.5"
  )

lazy val `Recursive-Function-Application` = (project in file("./Tail Recursion/Recursive Function Application"))
  .settings(
    scalaSource in Compile := baseDirectory.value / "src",
    scalaSource in Test := baseDirectory.value / "test",
    libraryDependencies += "org.scalatest" %% "scalatest" % "3.0.5"
  )

lazy val `Introduction` = (project in file("./Structuring Information/Introduction"))
  .settings(
    scalaSource in Compile := baseDirectory.value / "src",
    scalaSource in Test := baseDirectory.value / "test",
    libraryDependencies += "org.scalatest" %% "scalatest" % "3.0.5"
  )

lazy val `Defining-Alternatives-With-Sealed-Traits` = (project in file("./Structuring Information/Defining Alternatives With Sealed Traits"))
  .settings(
    scalaSource in Compile := baseDirectory.value / "src",
    scalaSource in Test := baseDirectory.value / "test",
    libraryDependencies += "org.scalatest" %% "scalatest" % "3.0.5"
  )

lazy val `Enumerations` = (project in file("./Structuring Information/Enumerations"))
  .settings(
    scalaSource in Compile := baseDirectory.value / "src",
    scalaSource in Test := baseDirectory.value / "test",
    libraryDependencies += "org.scalatest" %% "scalatest" % "3.0.5"
  )

lazy val `Higher-Order-Functions` = (project in file("./Higher Order Functions/Higher Order Functions"))
  .settings(
    scalaSource in Compile := baseDirectory.value / "src",
    scalaSource in Test := baseDirectory.value / "test",
    libraryDependencies += "org.scalatest" %% "scalatest" % "3.0.5"
  )

lazy val `List` = (project in file("./Standard Library/List"))
  .settings(
    scalaSource in Compile := baseDirectory.value / "src",
    scalaSource in Test := baseDirectory.value / "test",
    libraryDependencies += "org.scalatest" %% "scalatest" % "3.0.5"
  )

lazy val `Common-Operations-on-Lists` = (project in file("./Standard Library/Common Operations on Lists"))
  .settings(
    scalaSource in Compile := baseDirectory.value / "src",
    scalaSource in Test := baseDirectory.value / "test",
    libraryDependencies += "org.scalatest" %% "scalatest" % "3.0.5"
  )

lazy val `Error-Handling` = (project in file("./Standard Library/Error Handling"))
  .settings(
    scalaSource in Compile := baseDirectory.value / "src",
    scalaSource in Test := baseDirectory.value / "test",
    libraryDependencies += "org.scalatest" %% "scalatest" % "3.0.5"
  )

lazy val `Test_Lesson` = (project in file("./Test_Lesson"))
  .settings(
    scalaSource in Compile := baseDirectory.value / "src",
    scalaSource in Test := baseDirectory.value / "test",
    libraryDependencies += "org.scalatest" %% "scalatest" % "3.0.5"
  )
