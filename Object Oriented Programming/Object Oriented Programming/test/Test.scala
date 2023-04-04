import org.scalatest.matchers.should
import org.scalatest.refspec.RefSpec

class Test extends RefSpec with should.Matchers {

  def `dynamic binding`(): Unit = {
    Empty contains 1 shouldBe false
    ObjectOrientedProgramming.nonEmptyExample contains 7 shouldBe true
  }
}
