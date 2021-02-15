package inicio
package OOP_Espanioles

//hereda de bicicleta_2
class Bici_Montania (cadencia:Int,marcha:Int,velocidad:Int,val altura_silla:Int)
  extends Bicicleta_2(cadencia,marcha,velocidad)


object main_herencia extends App
{
  val bm=new Bici_Montania(1,2,3,4)

  println(bm.cadencia+" "+bm.marcha+" "+bm.velocidad+" "+bm.altura_silla)
}