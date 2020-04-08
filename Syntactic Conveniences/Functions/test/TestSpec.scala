import org.scalatest.{Matchers}
import org.scalatest.refspec.RefSpec

class TestSpec extends RefSpec with Matchers  {
  SyntacticConveniences.function(Array(0, 1, 4, 5), Array(0, 1)) shouldBe Array((0, 0), (0, 1) , (4, 0), (4, 1))
}
