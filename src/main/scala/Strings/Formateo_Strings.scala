package inicio
package Strings

object Formateo_Strings extends  App
{
  //justificacion de espacios
  val h = "Hello"

  println(f"'$h%s'")       // 'Hello'
  println(f"'$h%10s'")     // '     Hello'
  println(f"'$h%-10s'" )   // 'Hello     '

}
