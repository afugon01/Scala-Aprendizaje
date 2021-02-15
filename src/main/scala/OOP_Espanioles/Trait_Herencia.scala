package inicio
package OOP_Espanioles

trait Motor{
  val torque:Int=100
  val cadena:Int
}


class Motocicleta(cadencia:Int,marcha:Int,velocidad:Int,val cadena:Int)
  extends Bicicleta_2(cadena,marcha,velocidad )
  with Motor

object main_trait extends App
{
  val mc=new Motocicleta(10,2,3,4)

  println(mc.cadencia)
  println(mc.marcha)
  println(mc.velocidad)
  println(mc.cadena)
  print(mc.torque)
}

