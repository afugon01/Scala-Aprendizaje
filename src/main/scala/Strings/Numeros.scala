package inicio
package Strings

object Numeros extends App {
  val a = 10.3456         // a: Double = 10.3456
  val b = 101234567.3456  // b: Double = 1.012345673456E8

  //.1 es un decimal
  println(f"'${a}%.1f'")     // '10.3'
  println(f"'${a}%.2f'")     // '10.35'
  println(f"'${a}%8.2f'" )   // '   10.35'
  println(f"'${a}%8.4f'" )   // ' 10.3456'
  println(f"'${a}%08.2f'" )  // '00010.35'
  println(f"'${a}%-8.2f'"  ) // '10.35   '

  println(f"'${b}%-2.2f'")   // '101234567.35'
  println(f"'${b}%-8.2f'")   // '101234567.35'
  println(f"'${b}%-14.2f'")  // '101234567.35  '





  val ten = 10
  println(f"'${ten}%d'")         // '10'
  println(f"'${ten}%5d'")        // '   10'
  println(f"'${ten}%-5d'")       // '10   '

  val maxInt = Int.MaxValue
  println(f"'${maxInt}%5d'")     // '2147483647'

  val maxLong = Long.MaxValue
  println(f"'${maxLong}%5d'" )   // '9223372036854775807'
  println(f"'${maxLong}%22d'")   // '   9223372036854775807'

}
