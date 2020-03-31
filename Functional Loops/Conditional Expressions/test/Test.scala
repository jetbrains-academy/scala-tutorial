import FunctionalLoops.factorial
import org.scalatest.Matchers
import org.scalatest.refspec.RefSpec

class Test extends RefSpec with Matchers{

  def `check factorial`(): Unit = {
    factorial(0) shouldBe 1
    factorial(3) shouldBe 6
    factorial(4) shouldBe 24
    factorial(10) shouldBe 3628800
  }

}
