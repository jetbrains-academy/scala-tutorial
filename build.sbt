ThisBuild / scalaVersion := "2.13.10"
ThisBuild / crossScalaVersions := Seq("3.2.2", "2.13.10")

lazy val subprojects = new CompositeProject {
  override def componentProjects: Seq[Project] = file(".").listFiles
    .filter(_.isDirectory)
    .filter(isNotIgnored)
    .flatMap(getTasks(_))
    .map { p =>
      Project(p.getName.replace(" ", "-"), p)
        .settings(name := p.getName)
        .settings(
          Compile / scalaSource := baseDirectory.value / "src",
          Test / scalaSource := baseDirectory.value / "test",
          libraryDependencies += "org.scalatest" %% "scalatest" % "3.2.15" % Test
        )
    }
}

def getTasks(dir: File, level: Int = 0): Seq[File] =
  dir
    .listFiles()
    .filter(_.isDirectory)
    .filter(isNotIgnored)
    .filter(isTaskDir)

lazy val subprojectsRef = subprojects.componentProjects.map(m => m: ProjectReference)

lazy val root = Project(id = "Scala-Tutorial", base = file(".")).aggregate(subprojectsRef: _*)

def isTaskDir(dir: File): Boolean = new File(dir, "src").exists()
def isNotIgnored(dir: File): Boolean = !Seq(".git", ".idea", ".coursecreator", "project", "target").contains(dir.getName)
