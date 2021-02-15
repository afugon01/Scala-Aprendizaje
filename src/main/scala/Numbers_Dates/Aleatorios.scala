package inicio
package Numbers_Dates

object Aleatorios extends App {
  val r = scala.util.Random

  // random integers
  println(r.nextInt)      // 455978773
  r.nextInt      // -1837771511

  // returns a value between 0.0 and 1.0
  r.nextDouble   // 0.22095085955974536
  r.nextDouble   // 0.3349793259700605

  // returns a value between 0.0 and 1.0
  r.nextFloat    // 0.34705013
  r.nextFloat    // 0.79055405

  // set a seed when creating a new Random
  val m = new scala.util.Random(100)

  // update the seed after you already have a Random instance
  //m.setSeed(1000L)

  // limit the integers to a maximum value
  println(m.nextInt(6))   // 0
  m.nextInt(6)   // 5
  m.nextInt(6)   // 1

}
