import org.scalatest.{FlatSpec, Matchers}

object HigherOrderFunctions extends FlatSpec with Matchers {

  def tailRecSum(): Unit = {
    def sum(f: Int => Int, a: Int, b: Int): Int = {
      def loop(x: Int, acc: Int): Int = {
        if (x > b) acc
        else loop(x + 1, acc + f(x))
      }

      loop(a, 0)
    }

    sum(x => x, 1, 10) shouldBe 55
  }

}