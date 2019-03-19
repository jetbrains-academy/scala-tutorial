import org.scalatest.{FlatSpec, Matchers}

object StructuringInformation extends FlatSpec with Matchers {
  def caseClassProjection(): Unit = {
    case class Note(name: String, duration: String, octave: Int)
    val c3 = Note("C", "Quarter", 3)
    c3.name shouldBe "C"
    c3.duration shouldBe "Quarter"
    c3.octave shouldBe 3
  }
}