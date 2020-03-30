import org.scalatest.refspec.RefSpec

class Test extends RefSpec {

  def `check static typing`(): Unit = {
    withClue("There is an Error, as you need to put an integer as the end of range.") {
      assertCompiles("TermsAndTypes.staticTyping()")
    }
  }
}
