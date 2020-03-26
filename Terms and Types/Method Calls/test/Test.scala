import org.scalatest.{FlatSpec, Matchers}

class Test extends FlatSpec with Matchers{

  def `check methods`(): Unit = {
    TermsAndTypes.upperCaseMethod() shouldBe "HELLO, SCALA!"
    TermsAndTypes.absMethod() shouldBe 42
  }
}
