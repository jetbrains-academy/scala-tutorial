import LazyEvaluation.{builder, z, x, y}
import org.scalatest.Matchers
import org.scalatest.refspec.RefSpec

class Test extends RefSpec with Matchers{

  def `lazy evaluation`(): Unit = {
    z + y + x + z + y + x
    builder.result() shouldBe "xzyz"
  }
}
