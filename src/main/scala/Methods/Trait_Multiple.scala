package inicio
package Methods

object Trait_Multiple extends App{
  trait Human {
    def hello = "the Human trait"
  }

  trait Mother extends Human {
    override def hello = "Mother"
  }

  trait Father extends Human {
    override def hello = "Father"
  }

  class Child extends Human with Mother with Father {
    def printSuper = super.hello
    def printMother = super[Mother].hello
    def printFather = super[Father].hello
    def printHuman = super[Human].hello
  }


  val c = new Child

  //Also note that c.printSuper prints Father because Father is the last trait mixed into Child:
  println(c.printSuper)    // Father
  println(c.printMother)   // Mother
  println(c.printFather)   // Father
  println(c.printHuman)    // the Human trait

}
