object Ass5 {

  //1.Function Defination
  def areaOfCircle(radius: Double): Double ={
    math.Pi*radius*radius
  }

  //Anonymous Function
  val sortDescending = (list: List[Int]) => list.sortWith(_ > _)

  //Closures
  def makeAdd(x:Int):(Int=>Int) ={
    (y:Int) => (x + y)
  }
}

