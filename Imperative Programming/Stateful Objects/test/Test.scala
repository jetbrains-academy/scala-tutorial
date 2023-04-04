import org.scalatest.matchers.should
import org.scalatest.refspec.RefSpec

class Test extends RefSpec with should.Matchers {

  def `observational equivalence`(): Unit = {
    val x = new BankAccount
    val y = new BankAccount
    x deposit 30 shouldBe 30
    x withdraw 20 shouldBe 10
  }
}
