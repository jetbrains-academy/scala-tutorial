object HigherOrderFunctions {
  def sumBetween(f: Int => Int, a: Int, b: Int): Int = {
    def loop(x: Int, acc: Int): Int = {
      if (x > b) acc
      else loop(x + 1, acc + f(x))
    }

    loop(a, 0)
  }

  def main(args: Array[String]): Unit = {
    println(sumBetween (x => x, 1, 10))
  }

}