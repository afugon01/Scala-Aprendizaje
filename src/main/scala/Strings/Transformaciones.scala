package inicio
package Strings

object Transformaciones extends App {

  //cada caracter a mayuscula
  val upper = "yo, adrian".map(_.toUpper)
  println(upper)

  println()

 //filtra quita la a
  println("yo, adrian".filter(_ != 'a').map(_.toUpper))   // String = YO, DRIN

 println()

  //cada caracter lo imprime
  "hello".foreach(println)


 println()



  ///funcion map
  val x = "HELLO".map { c =>
    // simulating multiple lines
    val i: Int = c.toByte + 32
    //i
    i.toChar
  }

  println(x)
  // x: String = "hello"
}
