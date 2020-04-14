import RationalArithmetic.Rational
import org.scalatest.Matchers
import org.scalatest.refspec.RefSpec

class Test extends RefSpec with Matchers{

  def `dynamic binding`(): Unit = {

    val firstRational = new Rational(1, 2)
    val secondRational = new Rational(5, 7)

    (firstRational * secondRational).numer shouldBe 5
    (firstRational * secondRational).denom shouldBe 14
    (firstRational / secondRational).numer shouldBe 7
    (firstRational / secondRational).denom shouldBe 10
  }
}
