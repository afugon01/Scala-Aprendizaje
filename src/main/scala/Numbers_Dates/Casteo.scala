package inicio
package Numbers_Dates


object Casteo extends App{
  //de string a numeric
  "1".toByte     // Byte = 1
  "1".toShort    // Short = 1
  "1".toInt      // Int = 1
  println("1".toLong)     // Long = 1
  println("1".toFloat)    // Float = 1.0
  "1".toDouble   // Double = 1.0


  //de numeric a numeric
  val b: Byte = 1
  b.toShort       // Short = 1
  b.toInt         // Int = 1
  b.toLong        // Long = 1
  b.toFloat       // Float = 1.0
  b.toDouble      // Double = 1.0
}
