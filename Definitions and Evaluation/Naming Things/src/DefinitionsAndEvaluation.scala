import org.scalatest.{FlatSpec, Matchers}

object DefinitionsAndEvaluation extends FlatSpec with Matchers {

  def usingSquare(): Unit = {
    def square(x: Double) = Math.PI * x * x

    square(3.0) shouldBe 9.0 * Math.PI
  }

}