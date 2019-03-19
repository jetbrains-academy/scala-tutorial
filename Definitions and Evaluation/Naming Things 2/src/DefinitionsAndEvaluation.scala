import org.scalatest.{FlatSpec, Matchers}

object DefinitionsAndEvaluation extends FlatSpec with Matchers {
  def areaExercise(): Unit = {
    def square(x: Double) = x * x

    def area(radius: Double): Double = 3.14159 * square(radius)

    area(10) shouldBe 314.159
  }
}