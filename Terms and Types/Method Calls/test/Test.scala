import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should

class Test extends AnyFlatSpec with should.Matchers {

  def `check methods`(): Unit = {
    TermsAndTypes.upperCaseMethod() shouldBe "HELLO, SCALA!"
    TermsAndTypes.absMethod() shouldBe 42
  }
}
