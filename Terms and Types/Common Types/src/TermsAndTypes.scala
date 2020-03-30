object TermsAndTypes{

  def toHexStringMethod(): String = {
    16.toHexString
  }

  def containsMethod(): Boolean = {
    (0 to 10).contains(10)
  }
  def dropMethod(): String = {
    "foo".drop(1)
  }

  def takeMethod(): String = {
    "bar".take(2)
  }

  def main(args: Array[String]): Unit = {
    println(toHexStringMethod())
    println(containsMethod())
    println(dropMethod())
    println(takeMethod())
  }
}