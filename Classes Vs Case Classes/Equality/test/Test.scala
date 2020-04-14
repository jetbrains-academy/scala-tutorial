import ClassesVsCaseClasses.{aliceAccount, bobAccount, c3, cThree}
import org.scalatest.refspec.RefSpec
import org.scalatest.Matchers

class Test extends RefSpec with Matchers{

  def `test equality`(): Unit = {

    aliceAccount == bobAccount shouldBe false
    c3 == cThree shouldBe true

  }
}
