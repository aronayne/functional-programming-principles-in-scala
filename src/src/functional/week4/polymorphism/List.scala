package src.functional.week4.polymorphism

trait List[T] {

  def isEmpty: Boolean
  def head: T
  def tail: List[T]
}

class Cons[T](val head: T, val tail : List[T]) extends List[T] {
  def isEmpty = false
} 

class Nil[T] extends List[T] {
  def isEmpty = true;
  def head : Nothing = throw new NoSuchElementException("Nil.head")
  def tail : Nothing = throw new NoSuchElementException("Nil.tail")
}

//def singleTon[T](ele: T) = new Cons[T](elem, new Nil[T])