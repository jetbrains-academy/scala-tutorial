import org.scalatest.Matchers
import org.scalatest.refspec.RefSpec

class Test extends RefSpec with Matchers{

  def `dynamic binding`(): Unit = {
    Empty contains 1 shouldBe false
    ObjectOrientedProgramming.nonEmptyExample contains 7 shouldBe true
  }
}
