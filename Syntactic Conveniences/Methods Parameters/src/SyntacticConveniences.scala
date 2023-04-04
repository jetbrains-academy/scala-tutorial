object SyntacticConveniences {

  case class Range(start: Int, end: Int, step: Int = 1)


  def average(x: Int, xs: Int*): Double =
    (x :: xs.seq.toList).sum.toDouble / (xs.size + 1)


  type Result = Either[String, (Int, Int)]
  def divide(dividend: Int, divisor: Int): Result =
    if (divisor == 0) Left("Division by zero")
    else Right((dividend / divisor, dividend % divisor))

  def main(args: Array[String]): Unit = {
    val xs = Range(start = 1, end = 10)
    println("The step:")
    println(xs.step)

    println("average result:")
    println(average(1))
    println(average(1, 3))
    println(average(1, 3, 5, 7))

    println("divide result:")
    println(divide(4, 2))
    println(divide(5, 0))
  }
}