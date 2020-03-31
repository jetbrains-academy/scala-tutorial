import org.scalatest.Matchers
import org.scalatest.refspec.RefSpec

class Test extends RefSpec with Matchers{

  def `check square`(): Unit = {
    DefinitionsAndEvaluation.square(2) shouldBe 4
    DefinitionsAndEvaluation.square(10) shouldBe 100
  }

  def `check area`(): Unit = {
    DefinitionsAndEvaluation.area(10) shouldBe 314.159
    DefinitionsAndEvaluation.area(20) shouldBe 314.159*4
  }

}
