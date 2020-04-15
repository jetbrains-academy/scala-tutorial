import TypeBounds.{Animal, Mammal, Reptile, Zebra, selection}
import org.scalatest.Matchers
import org.scalatest.refspec.RefSpec

class Test extends RefSpec with Matchers{

  def `size exercise`(): Unit = {
    //Arrange
    val unknownAnimal = new Animal
    val reptile = new Reptile
    val mammal = new Mammal
    val zebra = new Zebra

    //Assert
    selection(unknownAnimal) shouldBe unknownAnimal
    selection(reptile) shouldBe reptile
    selection(mammal) shouldBe mammal
    selection(zebra) shouldBe zebra
  }
}
