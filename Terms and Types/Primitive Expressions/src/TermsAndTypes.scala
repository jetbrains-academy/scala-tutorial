import org.scalatest.{FlatSpec, Matchers}

object TermsAndTypes extends FlatSpec with Matchers {

  def evaluation(): Unit = {
    1 + 2 shouldBe 3
    "Hello, " ++ "Scala!" shouldBe "Hello, Scala!"
  }

}