import Ass7.{ClassHierarchy, Composition}
import org.scalatest.funsuite.AnyFunSuite

import java.io.{ByteArrayOutputStream, PrintStream}

class Ass7Test extends AnyFunSuite{
  def captureOutPut(block: => Unit): String = {
    val outCapture = new ByteArrayOutputStream()
    Console.withOut(new PrintStream(outCapture)) {
      block
    }
    outCapture.toString.trim
  }

  test("Dog Should Speak Correctly") {
    val output = captureOutPut(new ClassHierarchy.Dog().speak())
    assert(output == "Dog is Doing sound")
  }

  test("Cat Should Speak Correctly") {
    val output = captureOutPut(new ClassHierarchy.Cat().speak())
    assert(output == "Cat is Doing sound")
  }

  test("Zoo should manage all animals and make sound"){
    val zoo = new Composition.Zoo()
    zoo.addAnimal(new ClassHierarchy.Dog())
    zoo.addAnimal(new ClassHierarchy.Cat())

    val output = captureOutPut(zoo.makeAllSpeak())

    assert(output.contains("Dog is Doing sound"))
    assert(output.contains("Cat is Doing sound"))

  }
}
