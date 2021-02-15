package inicio
package Strings

object Comparacion_Strings extends App {
  val s1 = "Hello"
  val s2 = "Hello"
  val s3 = "H" + "ello"

  println(s1 == s2) // true
  println(s1 == s3) // true


  val a = "Kimberly"
  val b = "kimberly"

  //ignora las mayusculas
  println(a.equalsIgnoreCase(b)) // true


  //variable multilinea
  val foo =
    """This is
    a multiline
    String"""

  println(foo)


  //multilinea pero alineado
  val speech =
    """Four score and
      |seven years ago""".stripMargin

  println(speech)
}
