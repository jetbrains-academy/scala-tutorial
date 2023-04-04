import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should

object SyntacticConveniences extends AnyFlatSpec with should.Matchers {
  def pair(i: Int, s: String): (Int, String) = (i, s)

  def main(args: Array[String]): Unit = {
    val is: (Int, String) = pair(42, "foo")

    is match {
      case (i, s) =>
        println(i)
        println(s)
    }

    val (i, s) = is
    println(i)
    println(s)

    println(is._1)
    println(is._2)
  }
}