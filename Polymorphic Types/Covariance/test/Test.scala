import org.scalatest.matchers.should.Matchers
import org.scalatest.refspec.RefSpec

class Test extends RefSpec with Matchers {

  def `zebra vet can be assigned to mammal vet`(): Unit = {
    assertCompiles(
      """
         import Covariance._
         val mammalVet: AnimalVet[Mammal] = new AnimalVet(Zebra)
    """)
  }

  def `reptile vet can't be assigned to mammal vet`(): Unit = {
    assertDoesNotCompile(
    """
       import Covariance._
       val mammalVet: AnimalVet[Mammal] = new AnimalVet(Reptile)
    """)
  }
}
