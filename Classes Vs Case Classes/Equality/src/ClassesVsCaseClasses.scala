import org.scalatest.{FlatSpec, Matchers}

object ClassesVsCaseClasses extends FlatSpec with Matchers {
  def equality(): Unit = {
    val aliceAccount = new BankAccount
    val bobAccount   = new BankAccount

    aliceAccount == bobAccount shouldBe false

    val c3     = Note("C", "Quarter", 3)
    val cThree = Note("C", "Quarter", 3)

    c3 == cThree shouldBe true
  }
}