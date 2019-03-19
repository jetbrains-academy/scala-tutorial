import org.scalatest.{FlatSpec, Matchers}

object TermsAndTypes extends FlatSpec with Matchers {

  def methods(): Unit = {
    "Hello, Scala!".toUpperCase shouldBe "HELLO, SCALA!"
    -42.abs shouldBe 42
  }

}