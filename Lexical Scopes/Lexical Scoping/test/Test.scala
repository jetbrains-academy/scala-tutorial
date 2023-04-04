import org.scalatest.matchers.should
import org.scalatest.refspec.RefSpec

class Test extends RefSpec with should.Matchers {

  def `check object scopes`(): Unit = {
    LexicalScopes.objectScopes() shouldBe 3
  }

}
