object Covariance {

  trait Animal
  case object Reptile extends Animal

  abstract class Mammal extends Animal
  case object Zebra extends Mammal

  class AnimalVet[+T](val animal: T)

  def main(args: Array[String]): Unit = {
    val reptileVet = new AnimalVet(Reptile)
    val zebraVet = new AnimalVet(Zebra)

    //Uncomment the line below to see if the reptileAnimal passes type-checking
    // val vet: AnimalVet[Mammal] = reptileVet
    val mammalVet: AnimalVet[Mammal] = zebraVet

    println(reptileVet.animal.getClass.getSimpleName)
    println(zebraVet.animal.getClass.getSimpleName)
    println(mammalVet.animal.getClass.getSimpleName)
  }
}

