import org.scalatest.Spec

class Test extends Spec {

  def `test tuples`(): Unit = {
    SyntacticConveniences.tuples()
  }

  def `tuple extraction`(): Unit = {
    SyntacticConveniences.tupleExtraction()
  }

  def `tuple extraction 2`(): Unit = {
    SyntacticConveniences.tupleExtraction2()
  }

  def `tuple manipulation`(): Unit = {
    SyntacticConveniences.tupleManipulation()
  }
}
