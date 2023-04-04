import HigherOrderFunctions.sumBetween
import org.scalatest.refspec.RefSpec
import org.scalatest.matchers.should

class Test extends RefSpec with should.Matchers {

  def `check tail rec sum`(): Unit = {
    sumBetween(x => x, 1, 10) shouldBe 55
  }

}
