import ComputingSquareRoot.sqrt
import org.scalatest.matchers.should
import org.scalatest.refspec.RefSpec

class Test extends RefSpec with should.Matchers {

  def `check factorial`(): Unit = {
    sqrt(4).round shouldBe 2
    sqrt(36).round shouldBe 6
  }

}
