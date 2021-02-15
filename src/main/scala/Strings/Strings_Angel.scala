package inicio
package Strings

object Strings_Angel extends App {
  val s = "foo bar baz"

  println(s.count(_ == 'a')) // 2, cuenta cuantas veces aparece a

  println(s.dropRight(2)) // foo bar b, lista todos lso elementos excepto n de la derecha

  println(s.dropWhile(_ != 'b')) // bar baz, no entiendo

  println(s.filter(_ != 'o')) // f bar baz, muestra distintos de o


  println(s.sortWith(_ < _)) // "  aabbfoorz", ordena todo el conjunto de forma ascendente


  println(s.take(3)) // foo, toma los primeros 3 caracteres


  println(s.takeRight(3)) // baz, toma los ultimos 3


  println(s.takeWhile(_ != 'r')) // foo ba, va tomando todo hasta q cumpla la condicion


  println("scala".drop(2).take(2).capitalize) // ignora los primros dos, agarra la al y pone la primera mayuscula


}
