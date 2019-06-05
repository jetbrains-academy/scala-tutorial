import org.scalatest.{FlatSpec, Matchers}

object TypeBounds extends FlatSpec with Matchers {
  class Animal

  class Reptile extends Animal

  class Mammal extends Animal

  class Zebra extends Mammal

  def boundsExercise(): Unit = {
    def selection[A >: Zebra <: Animal](a: A): A =
      a

    val unknownAnimal = new Animal
    val reptile = new Reptile
    val mammal = new Mammal
    val zebra = new Zebra

    selection(unknownAnimal) shouldBe unknownAnimal
    selection(reptile) shouldBe reptile
    selection(mammal) shouldBe mammal
    selection(zebra) shouldBe zebra
  }
}