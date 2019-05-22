import org.scalatest.Spec

class Test extends Spec {

  def `default parameters`(): Unit = {
    SyntacticConveniences.defaultParameters()
  }

  def `repeated parameters`(): Unit = {
    SyntacticConveniences.repeatedParameters()
  }

  def `type alias`(): Unit = {
    SyntacticConveniences.typeAlias()
  }

}
