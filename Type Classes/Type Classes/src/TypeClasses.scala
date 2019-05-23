import org.scalatest.{FlatSpec, Matchers}

object TypeClasses extends FlatSpec with Matchers {
  def rationalOrdering(): Unit = {

    /**
      * Returns an integer whose sign communicates how the first parameter
      * compares to the second parameter.
      *
      * The result sign has the following meaning:
      *  - Negative if the first parameter is less than the second parameter
      *  - Positive if the first parameter is greater than the second parameter
      *  - Zero otherwise
      */
    val compareRationals: (Rational, Rational) => Int = (x: Rational, y: Rational) => x.numer * y.denom - y.numer * x.denom

    implicit val rationalOrder: Ordering[Rational] =
      new Ordering[Rational] {
        def compare(x: Rational, y: Rational): Int = compareRationals(x, y)
      }

    val half      = new Rational(1, 2)
    val third     = new Rational(1, 3)
    val fourth    = new Rational(1, 4)
    val rationals = List(third, half, fourth)
    Sorting.insertionSort(rationals) shouldBe List(fourth, third, half)
  }
}