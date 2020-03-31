import org.scalatest.Matchers
import org.scalatest.refspec.RefSpec

class Test extends RefSpec with Matchers {

  def `check scope rules`(): Unit = {
    val stream = new java.io.ByteArrayOutputStream()
    Console.withOut(stream) {
      LexicalScopes.scopeRules()
    }
    stream.toString().trim shouldBe ("16")
  }

}
