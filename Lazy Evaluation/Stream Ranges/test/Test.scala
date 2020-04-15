import LazyEvaluation.{rec, streamRange}
import org.scalatest.Matchers
import org.scalatest.refspec.RefSpec

class Test extends RefSpec with Matchers{

  def `test encoding`(): Unit = {
    streamRange(1, 10).take(3).toList
    rec shouldBe 3

    streamRange(1, 10).take(1).toList
    rec shouldBe 4


    streamRange(1, 10).take(2).toList
    rec shouldBe 6
  }
}
