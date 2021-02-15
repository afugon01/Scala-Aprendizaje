package inicio

object Funciones extends App {

  //lo de parentesis son parametros
  val addOne = (x: Int) => x + 1

  println(addOne(1)) // 2



  val add = (x: Int, y: Int) => x + y
  println("SEgundo: "+add(1, 2)) // 3

}
