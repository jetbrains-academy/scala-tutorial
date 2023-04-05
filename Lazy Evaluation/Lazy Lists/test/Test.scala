import LazyEvaluation.{llRange, rec}
import org.scalatest.matchers.should.Matchers
import org.scalatest.refspec.RefSpec

class Test extends RefSpec with Matchers {
  def `test encoding`(): Unit = {
    llRange(1, 10).take(3).toList
    rec shouldBe 3
    llRange(1, 10).take(1).toList
    rec shouldBe 4
    llRange(1, 10).take(2).toList
    rec shouldBe 6
  }
}