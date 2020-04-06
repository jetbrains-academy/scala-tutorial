import HigherOrderFunctions.sumBetween
import org.scalatest.refspec.RefSpec
import org.scalatest.Matchers

class Test extends RefSpec with Matchers {

  def `check tail rec sum`(): Unit = {
    sumBetween(x => x, 1, 10) shouldBe 55
  }

}
