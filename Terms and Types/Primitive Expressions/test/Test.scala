import org.scalatest.matchers.should
import org.scalatest.refspec.RefSpec

class Test extends RefSpec with should.Matchers {

  def `check sayHello`(): Unit = {
    TermsAndTypes.sayHello() shouldBe "Hello, Scala!"
  }

  def `check sumTheNumbers`(): Unit = {
    TermsAndTypes.sumTheNumbers() shouldBe 4
  }
}
