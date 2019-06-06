import org.scalatest.{FlatSpec, Matchers}

object Covariance extends FlatSpec with Matchers {
  class Animal[+T](val animal: T)

  class Reptile extends Animal

  class Mammal extends Animal

  class Zebra extends Mammal

  class AnimalVet(val animal:Animal[Mammal])

  def covarianceExercise(): Unit = {
    val reptile = new Reptile
    val zebra = new Zebra

    val reptileAnimal = new Animal[Reptile](reptile)
    val zebraAnimal = new Animal[Zebra](zebra)

    //Uncomment the line below to see if the reptileAnimal passes type-checking
    //val reptileVet = new AnimalVet(reptileAnimal)
    val zebraVet = new AnimalVet(zebraAnimal)
    zebraVet.animal shouldBe zebraAnimal
  }
}

