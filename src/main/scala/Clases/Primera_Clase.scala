package inicio
package Clases

object Primera_Clase extends App {


  class Employee(var firstName: String, var lastName: String) {

    println("the constructor begins ...")

    // some class fields
    var age = 0
    private var salary = 0d

    // some methods
    override def toString = s"$firstName $lastName is $age years old"
    def printEmployeeInfo = println(this)  //uses toString

    printEmployeeInfo
    println("the constructor ends")

    // more methods here ...

  }

  //objeto es la instancia de la clase
  val e = new Employee("Kim", "Carnes")



  e.firstName="Angel"
  e.lastName="Fugon"
  e.age=32
  //salary no puede ser accedida es privada
  print(e.printEmployeeInfo)
}
