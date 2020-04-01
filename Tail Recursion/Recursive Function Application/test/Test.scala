import org.scalatest.Matchers
import org.scalatest.refspec.RefSpec

class Test extends RefSpec with Matchers{

  def `check tail recursion`(): Unit = {
    TailRecursion.factorial(5) shouldBe 120
    TailRecursion.factorial(11) shouldBe 39916800
  }

}
