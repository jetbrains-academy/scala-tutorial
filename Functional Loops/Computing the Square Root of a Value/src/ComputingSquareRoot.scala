import org.scalatest.{FlatSpec, Matchers}

object ComputingSquareRoot extends FlatSpec with Matchers {

  def sqrtExample(): Unit = {
    def sqrt(x: Double) = sqrtIter(1.0, x)

    def sqrtIter (guess: Double, x: Double): Double =
      if (isGoodEnough(guess, x)) guess
      else sqrtIter(improve(guess, x), x)

    def improve(guess: Double, x: Double) = (guess + x/ guess) / 2

    def isGoodEnough(guess: Double, x: Double) = math.abs(guess * guess - x) < 0.001

    sqrt(4).round shouldBe 2
    sqrt(36).round shouldBe 6
  }

}