import org.scalatest.{FlatSpec, Matchers}

object LexicalScopes extends FlatSpec with Matchers {
  def scopeRules(): Unit = {
    val x = 0

    def f(y: Int) = y + 1

    val result = {
      val x = f(3)
      x * x
    } + x
    result shouldBe 16
  }
}