import StructuringInformation.{Note, Rest}
import org.scalatest.Matchers
import org.scalatest.refspec.RefSpec

class Test extends RefSpec with Matchers{

  def `check class equals`(): Unit = {
    //Arrange
    val c1     = Note("C", "Quarter", 1)
    val otherC1 = Note("C", "Quarter", 1)

    //Assert
    StructuringInformation.caseClassEquals(c1, otherC1) shouldBe true

    //Arrange
    val c2 = Note("C", "Whole", 2)

    //Assert
    StructuringInformation.caseClassEquals(c1, c2) shouldBe false

    //Assert
    StructuringInformation.caseClassEquals(c1, c1) shouldBe true
  }

  def `check Rest extends Symbol`(): Unit = {
    def isSymbol[P](implicit m: Manifest[P]): Boolean =
      classOf[StructuringInformation.Symbol].isAssignableFrom(m.erasure)

    isSymbol[Rest] shouldBe true
  }

}
