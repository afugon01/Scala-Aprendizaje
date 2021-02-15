package inicio

object Arreglo extends App{

 // val array: Array[String] = new Array(5)

  val arreglo_1: Array[String] = Array("tegus", null, "san pedro", null, null)

  //empienzan desde cero
  println(arreglo_1(0))
  println("************")

  // Print all the array elements
  for ( x <- arreglo_1 ) {
    println( x )
  }
}
