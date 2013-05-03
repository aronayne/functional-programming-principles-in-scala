package src.functional.week4.objects.everywhere

import src.functional.week4.objects.everywhere._

object BooleanTests {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  /* we start with the basic values and call an if/else control
 * implementation that prints "yes"/"no" depending on the target
 */
  True.ifThenElse(println("yes"), println("no"))  //> yes

  False.ifThenElse(println("yes"), println("no")) //> no

  /* we can negate */
  (!True).ifThenElse(println("yes"), println("no"))
                                                  //> no

  (!False).ifThenElse(println("yes"), println("no"))
                                                  //> yes

  /* and do some algebra */
  (True && False).ifThenElse(println("yes"), println("no"))
                                                  //> no

  (True || False).ifThenElse(println("yes"), println("no"))
                                                  //> yes

  /* or some equality tests */
  (True && True == True).ifThenElse(println("yes"), println("no"))
                                                  //> yes

  (False || True != True).ifThenElse(println("yes"), println("no"))
                                                  //> no

}