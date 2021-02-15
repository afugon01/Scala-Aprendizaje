package inicio
package Clases.Clase_SImple

class Point(xc: Int, yc: Int) {
  var x: Int = xc
  var y: Int = yc
  def move(dx: Int, dy: Int) {
    x = x + dx
    y = y + dy
  }
  //sobreescrito
  override def toString(): String = "(" + x + ", " + y + ")";
}