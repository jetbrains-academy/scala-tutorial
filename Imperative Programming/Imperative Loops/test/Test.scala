import ImperativeProgramming.factorial
import org.scalatest.matchers.should
import org.scalatest.refspec.RefSpec

class Test extends RefSpec with should.Matchers {

  def `test factorial`(): Unit = {

    factorial(2) shouldBe 2
    factorial(3) shouldBe 6
    factorial(4) shouldBe 24
    factorial(5) shouldBe 120
  }
}
