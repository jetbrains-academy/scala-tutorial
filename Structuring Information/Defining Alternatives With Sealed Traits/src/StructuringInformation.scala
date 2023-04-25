object StructuringInformation {

  sealed trait Symbol
  case class Note(name: String, duration: String, octave: Int) extends Symbol
  case class Rest(duration: String) extends Symbol

  def symbolDuration(symbol: Symbol): String =
    symbol match {
    case Note(name, duration, octave) => duration
    case Rest(duration) => duration
  }

  def caseClassEquals(note: Note, otherNote: Note): Boolean = {
    note == otherNote
  }

  def main(args: Array[String]): Unit = {
    val c3      = Note("C", "Quarter", 3)
    val otherC3 = Note("C", "Quarter", 3)
    val f3      = Note("F", "Quarter", 3)
    val wholeRest = Rest("Whole")

    println("c3 equals to otherC3: " + caseClassEquals(c3, otherC3))
    println("The duration of the c3 is: " + symbolDuration(c3))
    println("c3 equals to f3: " + caseClassEquals(c3, f3))
    println("The duration of the wholeRest is: " + symbolDuration(wholeRest))
  }
}