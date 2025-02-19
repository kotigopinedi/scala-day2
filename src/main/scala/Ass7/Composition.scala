package Ass7

import Ass7.ClassHierarchy.Animal

object Composition {

  class Zoo {
    private var animals: List[Ass7.ClassHierarchy.Animal] = List()

    def addAnimal(animal: Animal): Unit = {
      animals = animals :+ animal
    }

    def makeAllSpeak(): Unit = {
      animals.foreach(_.speak())
    }
  }
}
