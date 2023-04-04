import ClassesVsCaseClasses.{aliceAccount, bobAccount, c3, cThree}
import org.scalatest.refspec.RefSpec
import org.scalatest.matchers.should

class Test extends RefSpec with should.Matchers {

  def `test equality`(): Unit = {

    aliceAccount == bobAccount shouldBe false
    c3 == cThree shouldBe true

  }
}
