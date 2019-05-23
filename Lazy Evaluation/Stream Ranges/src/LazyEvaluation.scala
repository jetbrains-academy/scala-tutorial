import org.scalatest.{FlatSpec, Matchers}

object LazyEvaluation extends FlatSpec with Matchers {
  def streamRangeExercise(): Unit = {
    var rec = 0
    def streamRange(lo: Int, hi: Int): Stream[Int] = {
      rec = rec + 1
      if (lo >= hi) Stream.empty
      else Stream.cons(lo, streamRange(lo + 1, hi))
    }
    streamRange(1, 10).take(3).toList
    rec shouldBe 3
  }
}