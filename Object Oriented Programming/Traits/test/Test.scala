import ObjectOrientedProgramming.{Product, Sum}
import org.scalatest.Matchers
import org.scalatest.refspec.RefSpec

class Test extends RefSpec with Matchers{

  def `test reducer`(): Unit = {

    val nums = List(1, 2, 3, 4)

    Product.reduce(nums) shouldBe 24
    Sum.reduce(nums) shouldBe 10
  }
}
