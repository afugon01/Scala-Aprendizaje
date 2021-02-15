package inicio
package Strings

object Separadores extends App
{

  //imprime ya separado
  "hello world".split(" ").foreach(println)




  //Sustituyendo variables
  val name = "Angel"
  val age = 33
  val weight = 200.00

  println(s"$name is $age years old, and weighs $weight pounds.")
  println(s"Age next year: ${age + 1}")




  //con clases
  case class Student(name: String, score: Int)
  val hannah = Student("Hannah", 95)

  println(s"${hannah.name} has a score of ${hannah.score}")
}
