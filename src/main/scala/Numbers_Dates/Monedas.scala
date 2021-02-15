package inicio
package Numbers_Dates

import java.text.NumberFormat
import java.util.{Currency, Locale}

object Monedas extends App {

  //monedas con coma y punto
  val formatter = NumberFormat.getInstance

  println(formatter.format(12.34)  )      // 12.34
  println(formatter.format(1234.56))      // 1,234.56
  println(formatter.format(1234567.89))   // 1,234,567.89




  //imprime formato de alemania
  val deCurrency = Currency.getInstance(Locale.GERMANY)
  val formatte = java.text.NumberFormat.getCurrencyInstance
  formatte.setCurrency(deCurrency)

  formatte.format(123.456789)   // EUR123.46
  println(formatte.format(12345.6789))   // EUR12,345.68
  formatte.format(1234567.89)   // EUR1,234,567.89

}
