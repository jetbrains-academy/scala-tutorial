object TermsAndTypes {

  def upperCaseMethod(): String = {
    "Hello, Scala!".toUpperCase
  }

  def absMethod(): Int = {
    -42.abs
  }

  def main(args: Array[String]): Unit = {
    println(upperCaseMethod())
    println(absMethod())
  }

}