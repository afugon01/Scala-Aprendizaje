package inicio
package OOP_Espanioles

abstract class Bici_Carretera (cadencia:Int,marcha:Int,velocidad:Int)
  extends Bicicleta_2(cadencia,marcha,velocidad)
{
  val altura_silla:Int
}

object Main_Herencia extends App
{
  val bc=new Bici_Carretera(1,2,3)
  {
    override val altura_silla: Int = 100
  }


}