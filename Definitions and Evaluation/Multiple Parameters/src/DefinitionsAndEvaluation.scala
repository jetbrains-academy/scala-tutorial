import org.scalatest.{FlatSpec, Matchers}

object DefinitionsAndEvaluation extends FlatSpec with Matchers {

  def triangleAreaExercise(): Unit = {

    def triangleArea(base: Double, height: Double): Double =
      base * height / 2.0

    triangleArea(3, 4) shouldBe 6.0
    triangleArea(5, 6) shouldBe 15.0
  }
}