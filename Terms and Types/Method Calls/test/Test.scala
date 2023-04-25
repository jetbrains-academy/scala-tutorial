import org.scalatest.matchers.should.Matchers
import org.scalatest.refspec.RefSpec

class Test extends RefSpec with Matchers {

  def `check methods`(): Unit = {
    TermsAndTypes.upperCaseMethod() shouldBe "HELLO, SCALA!"
    TermsAndTypes.absMethod() shouldBe 42
  }
}
