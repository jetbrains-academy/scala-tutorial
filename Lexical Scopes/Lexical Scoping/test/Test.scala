import org.scalatest.Matchers
import org.scalatest.refspec.RefSpec

class Test extends RefSpec with Matchers{

  def `check object scopes`(): Unit = {
    LexicalScopes.objectScopes() shouldBe 3
  }

}
