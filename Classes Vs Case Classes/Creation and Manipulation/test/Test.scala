import ClassesVsCaseClasses.{aliceAccount, c3}
import org.scalatest.refspec.RefSpec
import org.scalatest.Matchers

class Test extends RefSpec with Matchers {

  def `creation And Manipulation`(): Unit = {
    c3.name shouldBe "C"
    aliceAccount.withdraw(50) shouldBe 50
  }
}
