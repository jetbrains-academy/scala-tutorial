import SyntacticConveniences.{greet, greetLouder}
import org.scalatest.Matchers
import org.scalatest.refspec.RefSpec

class Test extends RefSpec with Matchers{

  def `check greet`(): Unit = {
    greet("Test") shouldBe "Hello, Test!"
  }

  def `check greetLouder`(): Unit = {
    greetLouder("Test") shouldBe "Hello, TEST!"
  }
}
