import org.scalatest.{FlatSpec, Matchers}

object TermsAndTypes extends FlatSpec with Matchers {

  def moreMethods(): Unit = {
    16.toHexString shouldBe 10
    (0 to 10).contains(10) shouldBe true
    (0 until 10).contains(10) shouldBe false
    "foo".drop(1) shouldBe "oo"
    "bar".take(2) shouldBe "ba"
  }

}