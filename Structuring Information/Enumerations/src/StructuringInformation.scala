import org.scalatest.{FlatSpec, Matchers}

object StructuringInformation extends FlatSpec with Matchers {
  def adts(): Unit = {
    sealed trait Duration
    case object Whole   extends Duration
    case object Half    extends Duration
    case object Quarter extends Duration

    def fractionOfWhole(duration: Duration): Double =
      duration match {
        case Whole   => 1.0
        case Half    => 0.5
        case Quarter => 0.25
      }

    fractionOfWhole(Half) shouldBe 0.5
    fractionOfWhole(Quarter) shouldBe 0.25
  }
}