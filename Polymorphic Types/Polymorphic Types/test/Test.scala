import org.scalatest.Matchers
import org.scalatest.refspec.RefSpec

class Test extends RefSpec with Matchers {

  def `size exercise`(): Unit = {
    PolymorphicTypes.size(Nil) shouldBe 0
    PolymorphicTypes.size(List(1, 2)) shouldBe 2
    PolymorphicTypes.size(List("a", "b", "c")) shouldBe 3
  }
}
