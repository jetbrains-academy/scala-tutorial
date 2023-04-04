import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should

object FunctionalLoops extends AnyFlatSpec with should.Matchers {
  def factorial(n: Int): Int =
    if (n == 0) 1
    else factorial(n - 1) * n

  def main(args: Array[String]): Unit =
    println(factorial(5))

}