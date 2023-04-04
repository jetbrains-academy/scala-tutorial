import SyntacticConveniences.{greet, greetLouder}
import org.scalatest.matchers.should
import org.scalatest.refspec.RefSpec

class Test extends RefSpec with should.Matchers {

  def `check greet`(): Unit = {
    greet("Test") shouldBe "Hello, Test!"
  }

  def `check greetLouder`(): Unit = {
    greetLouder("Test") shouldBe "Hello, TEST!"
  }
}
