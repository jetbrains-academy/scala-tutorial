import org.scalatest.{FlatSpec, Matchers}

object StandardLibrary extends FlatSpec with Matchers {

  def optionMap(): Unit = {
    Some(1).map(x => x + 1) shouldBe Some(2)
    None.map((x: Int) => x + 1) shouldBe None
  }

  def optionFilter(): Unit = {
    Some(1).filter(x => x % 2 == 0) shouldBe None
    Some(2).filter(x => x % 2 == 0) shouldBe Some(2)
  }

  def optionFlatMap(): Unit = {
    Some(1).flatMap(x => Some(x + 1)) shouldBe Some(2)
    None.flatMap((x: Int) => Some(x + 1)) shouldBe None
  }

}