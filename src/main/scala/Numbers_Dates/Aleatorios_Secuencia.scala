package inicio
package Numbers_Dates
import scala.util.Random

  object Aleatorios_Secuencia extends App{
    val r = scala.util.Random


    //se genera una lista aleatoria
    println((0 to r.nextInt(10)).toList )    // List(0, 1, 2, 3, 4)
    println((0 to r.nextInt(10)).toVector)   // Vector(0, 1, 2)
    println((0 to r.nextInt(10)).toStream )  // Stream(0, ?)




  //hace aleatoria una lista existente
    val x = List(1, 2, 3)

    println(Random.shuffle(x))   // List(3, 1, 2)
    println(Random.shuffle(x) )  // List(2, 3, 1)
  }
