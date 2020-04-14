object ClassesVsCaseClasses {
  val aliceAccount = new BankAccount
  aliceAccount.deposit(100)
  val c3 = Note("C", "Quarter", 3)

  def main(args: Array[String]): Unit = {
    println(aliceAccount.withdraw(10))
    println(c3.name)
  }
}