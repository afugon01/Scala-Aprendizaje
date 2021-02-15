package inicio

object Metodos extends App
{


  def add(x: Int, y: Int): Int = x + y
  println(add(1, 2)) // 3


  //metodo q no tiene parametros, da el nombre logueado en el SO
  def name: String = System.getProperty("user.name")
  println("Hello, " + name + "!")


  //metodo de varias lineas
  def getSquareString(input: Double): String = {
    val square = input * input
    square.toString
  }
  println(getSquareString(2.5)) // 6.25
}
