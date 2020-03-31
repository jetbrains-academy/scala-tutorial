import DefinitionsAndEvaluation.square
import org.scalatest.Matchers
import org.scalatest.refspec.RefSpec

class Test extends RefSpec with Matchers {

  def `check square`(): Unit = {
    square(3.0) shouldBe 9.0 * Math.PI
  }
}
