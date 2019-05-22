import org.scalatest.{FlatSpec, Matchers}

object SyntacticConveniences extends FlatSpec with Matchers {
  def tuples(): Unit = {
    def pair(i: Int, s: String): (Int, String) = (i, s)

    pair(42, "foo") shouldBe (42, "foo")
    pair(0, "bar") shouldBe (0, "bar")
  }

  def tupleExtraction(): Unit = {
    val is: (Int, String) = (42, "foo")

    is match {
      case (i, s) =>
        i shouldBe 42
        s shouldBe "foo"
    }
  }

  def tupleExtraction2(): Unit = {
    val is: (Int, String) = (42, "foo")

    val (i, s) = is
    i shouldBe 42
    s shouldBe "foo"
  }

  def tupleManipulation(): Unit = {
    val is: (Int, String) = (42, "foo")
    is._1 shouldBe 42
    is._2 shouldBe "foo"
  }
}