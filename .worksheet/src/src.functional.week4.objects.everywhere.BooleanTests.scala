package src.functional.week4.objects.everywhere

import src.functional.week4.objects.everywhere._

object BooleanTests {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(166); 
  println("Welcome to the Scala worksheet");$skip(182); 
  /* we start with the basic values and call an if/else control
 * implementation that prints "yes"/"no" depending on the target
 */
  True.ifThenElse(println("yes"), println("no"));$skip(52); 

  False.ifThenElse(println("yes"), println("no"));$skip(76); 

  /* we can negate */
  (!True).ifThenElse(println("yes"), println("no"));$skip(55); 

  (!False).ifThenElse(println("yes"), println("no"));$skip(90); 

  /* and do some algebra */
  (True && False).ifThenElse(println("yes"), println("no"));$skip(62); 

  (True || False).ifThenElse(println("yes"), println("no"));$skip(100); 

  /* or some equality tests */
  (True && True == True).ifThenElse(println("yes"), println("no"));$skip(70); 

  (False || True != True).ifThenElse(println("yes"), println("no"))}

}
