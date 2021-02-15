package inicio
package Control_Structures

object Iteracion extends App{

  //itera la lista frutas
  val fruits = List("apple", "banana", "orange")
  for (f <- fruits)
    println(f)

  for (f <- fruits) {
  {
          // imagine this requires multiple lines
          val s = f.toUpperCase
          println(s)
    }
  }


  //teniendo en cuenta el indice
  for (i <- 0 until fruits.length) {
  {
    println(s"$i is ${fruits(i)}")
  }





  }

  //for
  println("***********")
  for (i <- 1 to 3)
    println(i)


  //looping sobre un map
  val names = Map(
    "fname" -> "Robert",
    "lname" -> "Goren"
  )

  for ((k,v) <- names)
    println(s"key: $k, value: $v")

  println("while")
  println("while")


  //while, q entra al menos una vez
  var i=0
  do {
         println(i)
         i += 1
     }
  while (i < 0)

}
