import StructuringInformation.{Half, Quarter, Whole, fractionOfWhole}
import org.scalatest.matchers.should
import org.scalatest.refspec.RefSpec

class Test extends RefSpec with should.Matchers {

  def `check algebraic data types`(): Unit = {
    fractionOfWhole(Half) shouldBe 0.5
    fractionOfWhole(Quarter) shouldBe 0.25
    fractionOfWhole(Whole) shouldBe 1
  }

}
