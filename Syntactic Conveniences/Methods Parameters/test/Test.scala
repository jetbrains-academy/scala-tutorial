import SyntacticConveniences.{Range, average, divide}
import org.scalatest.Matchers
import org.scalatest.refspec.RefSpec

class Test extends RefSpec with Matchers{

  def `default parameters`(): Unit = {
    val xs = Range(start = 1, end = 10)

    xs.step shouldBe 1
  }

  def `repeated parameters`(): Unit = {
    average(1) shouldBe 1.0
    average(1, 2) shouldBe 1.5
    average(1, 2, 3) shouldBe 2.0
  }

  def `type alias`(): Unit = {

    divide(6, 4) shouldBe Right((1, 2))
    divide(2, 0) shouldBe Left("Division by zero")
    divide(8, 4) shouldBe (Right((2, 0)): Either[String, (Int, Int)])
  }

}
