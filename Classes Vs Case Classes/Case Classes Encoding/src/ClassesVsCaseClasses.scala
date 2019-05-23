import org.scalatest.{FlatSpec, Matchers}

object ClassesVsCaseClasses extends FlatSpec with Matchers {
  def encoding(): Unit = {
    val c3 = Note("C", "Quarter", 3)
    c3.toString shouldBe "Note(C,Quarter,3)"
    val d = Note("D", "Quarter", 3)
    c3.equals(d) shouldBe false
    val c4 = c3.copy(octave = 4)
    c4.toString shouldBe "Note(C,Quarter,4)"
  }
}