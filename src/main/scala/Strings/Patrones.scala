package inicio
package Strings

object Patrones extends App {
  val numPattern = "[0-9]+".r

  val address = "123 Main Street Suite 999"

  //devuelve si hay numeros,devuelve los primeros q ncuentra, sino hay devuelve none
  val match1 = numPattern.findFirstIn(address)

  println(match1)


  println()

  ///////
  /////////
  ///////
  //imprime todas coincidencias
  val matches = numPattern.findAllIn(address)
  matches.foreach(println)


  ///reemplaza las coincidencias por cierto caracter
  //reemplaza todo
  val address_1 = "123 Main Street 666".replaceAll("[0-9]", "x")
  println(address_1)

  println()
  //obtener cierto caracter segun posicion
  println("hello"(0))    // Char = h
  println("hello"(1))    // Char = e
  //"hello"(99)   // java.lang.StringIndexOutOfBoundsException
}
