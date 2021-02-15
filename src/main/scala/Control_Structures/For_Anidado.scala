package inicio
package Control_Structures

object For_Anidado extends App{

  //for anidado
  for (i <- 1 to 2; j <- 1 to 2)
    println(s"i = $i, j = $j")



  for (i <- 1 to 10) {
    if (i % 2 == 0)
      println(i)
  }




  //map, imprime por posicion
  val days = Map(
    0 -> "Sunday",
    1 -> "Monday",
    2 -> "Tuesday",
    3 -> "Wednesday",
    4 -> "Thursday",
    5 -> "Friday",
    6 -> "Saturday"
  )

  println(days(0))   // prints "Sunday"



  // multiples condiciones como un or
  val i=3

  i match {
    case 1 | 3 | 5 | 7 | 9 => println("odd")
    case 2 | 4 | 6 | 8 | 10 => println("even")
    case _ => println("too big")
  }


  //imprimir valor mal ingresado
  val j=8
  j match {
    case 0 => println("1")
    case 1 => println("2")
    case default => println("You gave me: " + default)
  }

}
