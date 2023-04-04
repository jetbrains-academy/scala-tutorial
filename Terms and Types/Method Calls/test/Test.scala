import org.scalatest.matchers.should
import org.scalatest.refspec.RefSpec

class Test extends RefSpec with should.Matchers {

  def `check methods`(): Unit = {
    TermsAndTypes.upperCaseMethod() shouldBe "HELLO, SCALA!"
    TermsAndTypes.absMethod() shouldBe 42
  }
}
