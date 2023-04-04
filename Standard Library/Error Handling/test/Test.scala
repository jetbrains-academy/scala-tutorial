import StandardLibrary.tripleEither
import org.scalatest.matchers.should
import org.scalatest.refspec.RefSpec

class Test extends RefSpec with should.Matchers {

  def `check insertion sort`(): Unit = {

    tripleEither(Right(2)) shouldBe (Right[String, Int](6): Either[String, Int])
    tripleEither(Left("not a number")) shouldBe (Left[String, Int]("not a number"): Either[String, Int])

  }
}
