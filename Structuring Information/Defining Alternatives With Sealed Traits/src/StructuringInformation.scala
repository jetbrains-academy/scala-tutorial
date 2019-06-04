import org.scalatest.{FlatSpec, Matchers}

object StructuringInformation extends FlatSpec with Matchers {
  sealed trait Symbol
  def caseClassEquals(): Unit = {
    case class Note(name: String, duration: String, octave: Int) extends Symbol
    val c3      = Note("C", "Quarter", 3)
    val otherC3 = Note("C", "Quarter", 3)
    val f3      = Note("F", "Quarter", 3)
    (c3 == otherC3) shouldBe true
    (c3 == f3) shouldBe false
  }
}