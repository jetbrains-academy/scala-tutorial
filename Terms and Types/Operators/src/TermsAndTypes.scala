object TermsAndTypes {

  def staticTyping(): Range.Inclusive =
    1 to 5

  def main(args: Array[String]): Unit = {
    println(staticTyping())
  }
}