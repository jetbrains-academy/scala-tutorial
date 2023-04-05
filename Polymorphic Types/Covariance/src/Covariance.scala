object Covariance {
  class Animal[+T](val animal: T)

  trait AnimalKind
  class Reptile extends AnimalKind

  class Mammal extends AnimalKind

  class Zebra extends Mammal

  class AnimalVet(val animal:Animal[Mammal])

  def main(args: Array[String]): Unit = {
    val reptile = new Reptile
    val zebra = new Zebra

    val reptileAnimal = new Animal[Reptile](reptile)
    val zebraAnimal = new Animal[Zebra](zebra)

    //Uncomment the line below to see if the reptileAnimal passes type-checking
    //val reptileVet = new AnimalVet(reptileAnimal)
    val zebraVet = new AnimalVet(zebraAnimal)

    println(zebraVet)
  }
}

