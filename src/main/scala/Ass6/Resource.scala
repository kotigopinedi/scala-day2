package Ass6

trait Closable {
  def close() : Unit
}

class Resource extends Closable {
  def use() :Unit = println("using resource")
  def close() :Unit = println("Resource closed")
}

def using[T <: Closable](resource: T)(block: T => Unit): Unit = {
  try {
    block(resource)
  } finally {
    resource.close()
  }
}

