import scala.collection.mutable

object LazyEvaluation {
  val builder = new mutable.StringBuilder
  val x      = { builder += 'x'; 1 }
  lazy val y = { builder += 'y'; 2 }
  def z      = { builder += 'z'; 3 }

  def main(args: Array[String]): Unit = {

    println(z + y + x + z + y + x)

    println(builder.result())
  }

}