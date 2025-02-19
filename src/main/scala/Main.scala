import Ass6.{CustomControlStructure, Resource}
import Ass7.ClassHierarchy.Dog
import Ass7.ClassHierarchy.Cat
import Ass7.{ClassHierarchy, MethodOverriding}


object Main extends App {

  //Ass 5
  println(s"Area of cirlce with radius 5 :${Ass5.areaOfCircle(5)}")

  val numbers = List(1,4,3,2,5,7,6,9)
  val sortedNumbers = Ass5.sortDescending(numbers)

  println(sortedNumbers)

  val addFive = Ass5.makeAdd(5)
  println(addFive(5))

  //Ass 6
  var sum = 0
  CustomControlStructure.repeat(5) { num =>
    sum += num

  }
  println(sum)

  Ass6.using(new Resource) { res =>
    res.use()
  }

  //Ass 7

  val dog = new ClassHierarchy.Dog()
  val cat = new ClassHierarchy.Cat()

  dog.speak()
  cat.speak()

  val wheels = new MethodOverriding.wheels()

  val mirrors = new MethodOverriding.Mirrors()

  wheels.carHas()
  mirrors.carHas()

  println("Ass7 Composition zoo")
  val zoo = Ass7.Composition.Zoo()
  zoo.addAnimal(new Dog())
  zoo.addAnimal(new Cat())
  zoo.makeAllSpeak()


}
