object PolymorphicTypes {
  def size[A](xs: List[A]): Int =
    xs match {
      case Nil     => 0
      case y :: ys => 1 + size(ys)
    }

  def main(args: Array[String]): Unit = {
    println(size(Nil))
    println(size(List(1, 2 , 3)))
    println(size(1::3::Nil))
  }
}