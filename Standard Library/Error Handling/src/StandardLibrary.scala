object StandardLibrary{

  def triple(x: Int): Int = 3 * x

  def tripleEither(x: Either[String, Int]): Either[String, Int] =
    x.map(triple)

  def main(args: Array[String]): Unit = {
    println(tripleEither(Right(1)))
    println(tripleEither(Left("not a number")))
  }
}