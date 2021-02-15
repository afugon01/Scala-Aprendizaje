package inicio
package OOP_Espanioles

object angel extends App
{

  class Bicicleta_Clase (val cadencia:Int,val marcha:Int,val velocidad:Int)
  {
    //otro constructor
    def this(_cadencia:Int, _marcha:Int)={
      this(_cadencia,_marcha,500)
    }

    def frenar(x:Int):Bicicleta_Clase={
      new Bicicleta_Clase(cadencia,marcha,velocidad-x)
    }
  }

  //si solo hay dos parametros llama el segundo constructor
  val b4=new Bicicleta_Clase(10,5,10)
  println(b4.cadencia+" "+b4.velocidad)

  val b5= b4.frenar(8)

  //la velocidad de b4 no se ve afectado solo b5
  println(b4.cadencia+" "+b4.velocidad)

  println(b5.cadencia+" "+b5.velocidad)


}


