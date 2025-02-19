import Ass6.{CustomControlStructure, Resource}
import org.scalatest.funsuite.AnyFunSuite

import java.io.{ByteArrayOutputStream, PrintStream}

class Ass6Test extends AnyFunSuite{

  test("repeat should execute block n times"){
    var sum = 0
    CustomControlStructure.repeat(5){ num =>
      sum += num

    }
    assert(sum == 15)
  }

  test("using should execute block and close resource") {
    val outCapture = new ByteArrayOutputStream()
    Console.withOut(new PrintStream(outCapture)){
      Ass6.using(new Resource) {res =>
        res.use()
      }
    }
    val output = outCapture.toString.trim.split("\n")

    assert(output(0) == "using resource")
    assert(output(1) == "Resource closed")
  }
}
