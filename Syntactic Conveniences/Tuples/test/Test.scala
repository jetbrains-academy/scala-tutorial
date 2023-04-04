import org.scalatest.matchers.should
import org.scalatest.refspec.RefSpec

class Test extends RefSpec with should.Matchers {

  def `test pair`(): Unit = {
    SyntacticConveniences.pair(37, "Test") shouldBe (37, "Test")
  }

}
