import StandardLibrary.insert
import org.scalatest.Matchers
import org.scalatest.refspec.RefSpec

class Test extends RefSpec with Matchers {

  def `check insertion sort`(): Unit = {

    insert(2, 1 :: 3 :: Nil) shouldBe (1 :: 2 :: 3 :: Nil)
    insert(1, 2 :: 3 :: Nil) shouldBe (1 :: 2 :: 3 :: Nil)
    insert(3, 1 :: 2 :: Nil) shouldBe (1 :: 2 :: 3 :: Nil)
  }

}
