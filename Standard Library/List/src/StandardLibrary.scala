import org.scalatest.{FlatSpec, Matchers}

object StandardLibrary extends FlatSpec with Matchers {
  def insertionSort(): Unit = {
    val cond: (Int, Int) => Boolean = (_: Int) < (_: Int)
    def insert(x: Int, xs: List[Int]): List[Int] =
      xs match {
        case List() => x :: List.empty[Int]
        case y :: ys =>
          if (cond(x, y)) x :: y :: ys
          else y :: insert(x, ys)
      }
    insert(2, 1 :: 3 :: Nil) shouldBe (1 :: 2 :: 3 :: Nil)
    insert(1, 2 :: 3 :: Nil) shouldBe (1 :: 2 :: 3 :: Nil)
    insert(3, 1 :: 2 :: Nil) shouldBe (1 :: 2 :: 3 :: Nil)
  }
}