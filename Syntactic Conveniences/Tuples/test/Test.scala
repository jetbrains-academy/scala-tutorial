import org.scalatest.Matchers
import org.scalatest.refspec.RefSpec

class Test extends RefSpec with Matchers{

  def `test pair`(): Unit = {
    SyntacticConveniences.pair(37, "Test") shouldBe (37, "Test")
  }

}
