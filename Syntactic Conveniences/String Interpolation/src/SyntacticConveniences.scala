import org.scalatest.{FlatSpec, Matchers}

object SyntacticConveniences extends FlatSpec with Matchers {
  def stringInterpolation(): Unit = {
    def greet(name: String): String =
      s"Hello, $name!"

    greet("Scala") shouldBe "Hello, Scala!"
    greet("Functional Programming") shouldBe "Hello, Functional Programming!"
  }

  def stringInterpolation2(): Unit = {
    def greet(name: String): String =
      s"Hello, ${name.toUpperCase}!"

    greet("Scala") shouldBe "Hello, SCALA!"
  }
}