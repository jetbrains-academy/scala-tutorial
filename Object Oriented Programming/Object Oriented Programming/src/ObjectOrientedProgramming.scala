import org.scalatest.{FlatSpec, Matchers}

object ObjectOrientedProgramming extends FlatSpec with Matchers {
  def dynamicBinding(): Unit = {
    Empty contains 1 shouldBe false
    new NonEmpty(7, Empty, Empty) contains 7 shouldBe true
  }
}