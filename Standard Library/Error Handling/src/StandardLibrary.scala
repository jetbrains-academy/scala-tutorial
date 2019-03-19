import org.scalatest.{FlatSpec, Matchers}

object StandardLibrary extends FlatSpec with Matchers {

  def either(): Unit = {
    def triple(x: Int): Int = 3 * x

    def tripleEither(x: Either[String, Int]): Either[String, Int] =
      x.right.map(triple)

    tripleEither(Right(1)) shouldBe (Right[String, Int](3): Either[String, Int])
    tripleEither(Left("not a number")) shouldBe (Left[String, Int]("not a number"): Either[String, Int])
  }

}