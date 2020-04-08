import org.scalatest.Matchers
import org.scalatest.refspec.RefSpec

class Test extends RefSpec with Matchers {

  def `check option map`(): Unit = {
    StandardLibrary.optionMap(Some(2)) shouldBe Some(3)
    StandardLibrary.optionMap(None) shouldBe None
  }

  def `check option filter`(): Unit = {
    StandardLibrary.optionFilter(Some(49)) shouldBe None
    StandardLibrary.optionFilter(Some(12)) shouldBe Some(12)
  }

  def `check option flat map`(): Unit = {
    StandardLibrary.optionFlatMap(Some(5)) shouldBe Some(6)
    StandardLibrary.optionFlatMap(None) shouldBe None
  }

}
