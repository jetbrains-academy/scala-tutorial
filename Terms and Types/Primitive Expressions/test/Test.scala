import org.scalatest.Matchers
import org.scalatest.refspec.RefSpec

class Test extends RefSpec with Matchers {

  def `check sayHello`(): Unit = {
    TermsAndTypes.sayHello() shouldBe "Hello, Scala!"
  }

  def `check sumTheNumbers`(): Unit = {
    TermsAndTypes.sumTheNumbers() shouldBe 4
  }
}
