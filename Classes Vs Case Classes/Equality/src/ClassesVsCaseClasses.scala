object ClassesVsCaseClasses {
  val aliceAccount = new BankAccount
  val bobAccount   = new BankAccount

  val c3     = Note("C", "Quarter", 3)
  val cThree = Note("C", "Quarter", 3)

  def main(args: Array[String]): Unit = {
    println(aliceAccount == bobAccount)
    print(c3 == cThree)
  }
}