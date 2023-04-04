import org.scalatest.matchers.should
import org.scalatest.refspec.RefSpec

class Test extends RefSpec with should.Matchers {

  def `check toHexString method`(): Unit = {
    TermsAndTypes.toHexStringMethod() shouldBe "10"
  }

  def `check contains method`(): Unit = {
    TermsAndTypes.containsMethod() shouldBe true
  }

  def `check drop method`() : Unit = {
    TermsAndTypes.dropMethod() shouldBe "oo"
  }

  def `check take method`(): Unit = {
    TermsAndTypes.takeMethod() shouldBe "ba"
  }
}
