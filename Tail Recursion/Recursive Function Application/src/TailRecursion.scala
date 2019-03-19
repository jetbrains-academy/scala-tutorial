import org.scalatest.{FlatSpec, Matchers}

import scala.annotation.tailrec

object TailRecursion extends FlatSpec with Matchers {
  def tailRecFactorial(): Unit = {
    def factorial(n: Int): Int = {
      @tailrec
      def iter(x: Int, result: Int): Int =
        if (x == 0) result
        else iter(x - 1, result * x)

      iter(n, 1)
    }

    factorial(3) shouldBe 6
    factorial(4) shouldBe 24
  }
}