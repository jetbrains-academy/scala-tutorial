import org.scalatest.{FlatSpec, Matchers}

object ClassesVsCaseClasses extends FlatSpec with Matchers {
  def creationAndManipulation(): Unit = {
    val aliceAccount = new BankAccount
    aliceAccount.deposit(100)
    val c3 = Note("C", "Quarter", 3)

    c3.name shouldBe "C"
    aliceAccount.withdraw(50) shouldBe 50
  }
}