import org.scalatest.{FlatSpec, Matchers}

object ClassesVsCaseClasses extends FlatSpec with Matchers {
  def creationAndManipulation(): Unit = {
    val aliceAccount = new BankAccount
    val c3           = Note("C", "Quarter", 3)

    c3.name shouldBe "C"
  }
}