object DefinitionsAndEvaluation {

  def triangleArea(base: Double, height: Double): Double =
      base * height / 2.0

  def main(args: Array[String]): Unit = {
    println(triangleArea(3, 6))
  }
}