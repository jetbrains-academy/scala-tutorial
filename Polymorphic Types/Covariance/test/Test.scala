import Covariance.{Animal, AnimalVet, Reptile, Zebra}
import org.scalatest.matchers.should
import org.scalatest.refspec.RefSpec

class Test extends RefSpec with should.Matchers {

  def `size exercise`(): Unit = {
    //Arrange
    val zebra = new Zebra
    val zebraAnimal = new Animal[Zebra](zebra)
    val zebraVet = new AnimalVet(zebraAnimal)

    //Assert
    zebraVet.animal shouldBe zebraAnimal
  }
}
