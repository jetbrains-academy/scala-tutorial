import DefinitionsAndEvaluation.triangleArea
import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should

class Test extends AnyFlatSpec with should.Matchers {

  def `check triangle area`(): Unit = {
    triangleArea(3, 4) shouldBe 6.0
    triangleArea(5, 6) shouldBe 15.0
  }

}
