package Ass6

object CustomControlStructure {

  //Custom control structure
  def repeat(n:Int)(block : Int => Unit):Unit ={
    for (i <- 1 to n) block(i)
  }
}
