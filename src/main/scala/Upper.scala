package inicio

object Upper extends App{

  //la clase tiene un metodo, q tiene como parametro sequencia de string
  class Upper1{
    def convert(strings: Seq[String]): Seq[String] =
      strings.map((s: String) => s.toUpperCase())
  }

  //hace una instacia de la clase
  val up = new Upper1()

  println(up.convert(List("Hello", "World!")))

}
