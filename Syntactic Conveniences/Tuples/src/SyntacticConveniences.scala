object SyntacticConveniences {
  def pair(i: Int, s: String): (Int, String) = (i, s)

  def main(args: Array[String]): Unit = {
    val is: (Int, String) = pair(42, "foo")

    is match {
      case (i, s) =>
        println(i)
        println(s)
    }

    val (i, s) = is
    println(i)
    println(s)

    println(is._1)
    println(is._2)
  }
}