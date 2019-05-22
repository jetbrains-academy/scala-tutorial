object SyntacticConveniences {
  def function(xs: Array[Int], ys: Array[Int]): Unit = {
    for {
      x <- xs if x % 2 == 0
      y <- ys
    } yield (x, y)
  }

  def functionDesugared(xs: Array[Int], ys: Array[Int]): Unit = {
    xs.filter { x =>
      x % 2 == 0
    }.flatMap { x =>
      ys.map { y =>
        (x, y)
      }
    }
  }
}