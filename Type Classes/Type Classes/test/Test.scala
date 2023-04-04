import TypeClasses.rationalOrder
import org.scalatest.matchers.should
import org.scalatest.refspec.RefSpec

class Test extends RefSpec with should.Matchers {

  def `rational Ordering`(): Unit = {
    val testThird      = new Rational(1, 3)
    val testHalf     = new Rational(2, 4)
    val testSixth    = new Rational(1, 6)
    val rationals = List(testThird, testHalf, testSixth)
    Sorting.insertionSort(rationals) shouldBe List(testSixth, testThird, testHalf)
  }
}
