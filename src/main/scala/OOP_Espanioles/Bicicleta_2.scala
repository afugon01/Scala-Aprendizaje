package inicio
package OOP_Espanioles

  object Bicicleta_2{
    def crear (cadencia:Int,marcha:Int,velocidad:Int):Bicicleta_2={
      new Bicicleta_2(cadencia,marcha,velocidad)
    }
  }


  class Bicicleta_2 (val cadencia:Int,val marcha:Int,val velocidad:Int)
  {
    //otro constructor
    def this(_cadencia:Int, _marcha:Int)={
      this(_cadencia,_marcha,500)
    }

    def frenar(x:Int):Bicicleta_2={
      new Bicicleta_2(cadencia,marcha,velocidad-x)
    }
  }


  object main_angel extends App
  {
    //no ocupa new para crearla gracias al objeto
    val b1=Bicicleta_2.crear(10,6,8)

    println(b1.cadencia+" "+b1.marcha+" "+b1.velocidad)
  }

