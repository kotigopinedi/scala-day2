import org.scalatest.funsuite.AnyFunSuite

class Ass5Test extends AnyFunSuite{
  test("Should return correct area"){
    assert(Ass5.areaOfCircle(1)===math.Pi)
    assert(Ass5.areaOfCircle(2)=== math.Pi*4)
  }

  test("Should Sort numbers in descending order"){
    val list = List(1,4,3,2,5,7,6,9)
    assert(Ass5.sortDescending(list) === List(9,7,6,5,4,3,2,1))
  }

  test("should return corect function"){
    val addThree = Ass5.makeAdd(3)
    assert(addThree(7)===10)
    assert(addThree(0)===3)
  }
}
