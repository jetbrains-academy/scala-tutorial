object SyntacticConveniences{
  def greet(name: String): String =
    s"Hello, $name!"

  def greetLouder(name: String): String =
    s"Hello, ${name.toUpperCase}!"

  def main(args: Array[String]): Unit = {
    println(greet("Scala"))
    println(greet("Functional Programming"))
    println(greetLouder("Scala"))
  }
}