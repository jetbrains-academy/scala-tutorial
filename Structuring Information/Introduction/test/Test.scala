import org.scalatest.Matchers
import org.scalatest.refspec.RefSpec

class Test extends RefSpec with Matchers{

  def `check class projection`(): Unit = {
    val c3 = StructuringInformation.setUpC3Note()
    withClue("The name of the Note should be 3\n") {c3.name shouldBe "C"}
    withClue("The duration of the note should be Quarter\n") {c3.duration shouldBe "Quarter"}
    withClue("The octave of the note should be 3\n") {c3.octave shouldBe 3}
  }

}
