import org.scalatest.{FlatSpec, Matchers}

object ImperativeProgramming extends FlatSpec with Matchers {


  def observationalEquivalence(): Unit = {
    val x = new BankAccount
    val y = new BankAccount
    x deposit 30
    x withdraw 20 shouldBe 10
  }

}
