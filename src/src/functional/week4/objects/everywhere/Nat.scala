package src.functional.week4.objects.everywhere

abstract class Nat {
  def isZero : scala.Boolean
  def predecessor : Nat
  def successor = new Successor(this)
  def + (that : Nat) : Nat
  def - (that : Nat) : Nat
}

object Zero extends Nat {
  def isZero = true
  def predecessor = throw new Error("0.predecessor")
  def + (that: Nat) = that
  def - (that: Nat) = if(that.isZero) this else throw new Error("negative number")
}

class Successor(n : Nat) extends Nat {
  def isZero = false
  def predecessor = n
  def +(that : Nat) = new Successor(n + that)
  def -(that: Nat) = n - that.predecessor
}