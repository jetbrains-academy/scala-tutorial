import org.scalatest.{FlatSpec, Matchers}

object ObjectOrientedProgramming{
  var nonEmptyExample = new NonEmpty(7, Empty, Empty)

  def main(args: Array[String]): Unit = {
    println(Empty contains 2)
    println(nonEmptyExample contains 7)
  }
}