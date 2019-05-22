import org.scalatest.{FlatSpec, Matchers}

object SyntacticConveniences extends FlatSpec with Matchers {

  def defaultParameters(): Unit = {
    case class Range(start: Int, end: Int, step: Int = 1)

    val xs = Range(start = 1, end = 10)

    xs.step shouldBe 1
  }

  def repeatedParameters(): Unit = {
    def average(x: Int, xs: Int*): Double =
      (x :: xs.to[List]).sum.toDouble / (xs.size + 1)

    average(1) shouldBe 1.0
    average(1, 2) shouldBe 1.5
    average(1, 2, 3) shouldBe 2.0
  }

  def typeAlias(): Unit = {
    type Result = Either[String, (Int, Int)]
    def divide(dividend: Int, divisor: Int): Result =
      if (divisor == 0) Left("Division by zero")
      else Right((dividend / divisor, dividend % divisor))
    divide(6, 4) shouldBe Right((1, 2))
    divide(2, 0) shouldBe Left("Division by zero")
    divide(8, 4) shouldBe (Right((2, 0)): Either[String, (Int, Int)])
  }
}