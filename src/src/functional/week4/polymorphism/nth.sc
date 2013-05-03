package src.functional.week4

import src.functional.week4._

object nth {
  def nth[T](n: Int, xs: List[T]) : T =
  
    if(xs.isEmpty) throw new IndexOutOfBoundsException
  	else if(n == 0) xs.head
  	else nth(n - 1, xs.tail)                  //> nth: [T](n: Int, xs: src.functional.week4.List[T])T
  	
  	val list = new Cons(1, new Cons(2, new Cons(3, new Nil)))
                                                  //> list  : src.functional.week4.Cons[Int] = src.functional.week4.Cons@197a37c
  	nth(0 , list)                             //> res0: Int = 1
  	nth(4 , list)                             //> java.lang.IndexOutOfBoundsException
                                                  //| 	at src.functional.week4.nth$$anonfun$main$1.nth$1(src.functional.week4.n
                                                  //| th.scala:8)
                                                  //| 	at src.functional.week4.nth$$anonfun$main$1.apply$mcV$sp(src.functional.
                                                  //| week4.nth.scala:14)
                                                  //| 	at org.scalaide.worksheet.runtime.library.WorksheetSupport$$anonfun$$exe
                                                  //| cute$1.apply$mcV$sp(WorksheetSupport.scala:76)
                                                  //| 	at org.scalaide.worksheet.runtime.library.WorksheetSupport$.redirected(W
                                                  //| orksheetSupport.scala:65)
                                                  //| 	at org.scalaide.worksheet.runtime.library.WorksheetSupport$.$execute(Wor
                                                  //| ksheetSupport.scala:75)
                                                  //| 	at src.functional.week4.nth$.main(src.functional.week4.nth.scala:5)
                                                  //| 	at src.functional.week4.nth.main(src.functional.week4.nth.scala)
  	nth(-1, list)
  	
}