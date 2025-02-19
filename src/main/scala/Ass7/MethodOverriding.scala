package Ass7

object MethodOverriding {
  
  abstract class Car {
    def carHas() : Unit =println("This is car ")
  }
  
  class wheels extends Car{
    override def carHas(): Unit = {
      super.carHas()
      println("car has wheels")
    }
  }
  
  class Mirrors extends Car {
    override def carHas(): Unit = {
      super.carHas()
      println("car has Mirrors")
    }
  }
}
