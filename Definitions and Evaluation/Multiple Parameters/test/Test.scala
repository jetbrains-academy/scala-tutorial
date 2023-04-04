import DefinitionsAndEvaluation.triangleArea
import org.scalatest.matchers.should
import org.scalatest.refspec.RefSpec

class Test extends RefSpec with should.Matchers {

  def `check triangle area`(): Unit = {
    triangleArea(3, 4) shouldBe 6.0
    triangleArea(5, 6) shouldBe 15.0
  }

}
