import org.scalatest.Spec

class Test extends Spec {

  def `check option map`(): Unit = {
    StandardLibrary.optionMap()
  }

  def `check option filter`(): Unit = {
    StandardLibrary.optionFilter()
  }

  def `check option flat map`(): Unit = {
    StandardLibrary.optionFlatMap()
  }

}
