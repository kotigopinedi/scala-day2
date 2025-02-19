package Ass7

object ClassHierarchy {


  abstract class Animal {
    def speak(): Unit
  }

  class Dog extends Animal {
    override def speak(): Unit = println("Dog is Doing sound")
  }

  class Cat extends Animal {
    override def speak(): Unit = println("Cat is Doing sound")
  }

}
