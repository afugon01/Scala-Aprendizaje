package inicio
package Methods

object Multiples_Parametros extends App {

  //* para n cantidad de argumentos
  def printAll(strings: String*) = {
    strings.foreach(println)
  }

  // these all work
  printAll()
  printAll("a")
  printAll("a", "b")
  printAll("a", "b", "c")

}
