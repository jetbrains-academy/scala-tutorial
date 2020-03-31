import DefinitionsAndEvaluation.triangleArea
import org.scalatest.refspec.RefSpec
import org.scalatest.Matchers

class Test extends RefSpec with Matchers {

  def `check triangle area`(): Unit = {
    triangleArea(3, 4) shouldBe 6.0
    triangleArea(5, 6) shouldBe 15.0
  }

}
