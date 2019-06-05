import org.scalatest.{FlatSpec, Matchers}

object RationalArithmetic extends FlatSpec with Matchers {
  class Rational(x: Int, y: Int) {
    private def gcd(a: Int, b: Int): Int = if (b == 0) a else gcd(b, a % b)
    private val g = gcd(x, y)
    def numer = x / g
    def denom = y / g
    def + (r: Rational) =
      new Rational(
        numer * r.denom + r.numer * denom,
        denom * r.denom
      )
    def - (r: Rational) =
      new Rational(
        numer * r.denom - r.numer * denom,
        denom * r.denom
      )
    def * (r: Rational) =
      new Rational(
        numer * r.numer ,
        denom * r.denom
      )
    def / (r: Rational) =
      new Rational(
        numer * r.denom ,
        denom * r.numer
      )
  }

  def rationalArithmeticTest(): Unit = {
    val firstRational = new Rational(1, 2)
    val secondRational = new Rational(5, 7)

    (firstRational * secondRational).numer shouldBe 5
    (firstRational * secondRational).denom shouldBe 14
    (firstRational / secondRational).numer shouldBe 7
    (firstRational / secondRational).denom shouldBe 10
  }
}