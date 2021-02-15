package inicio
package Numbers_Dates


import java.time.LocalDate
import java.time.temporal.ChronoUnit.DAYS


object Diferencia_Fechas extends App{


  val now  = LocalDate.of(2019,  1, 20)   // 2019-01-20
  val xmas = LocalDate.of(2019, 12, 25)   // 2019-12-25

  println(DAYS.between(now, xmas)   )              // Long = 339


  //val years: Long  = YEARS.between(now, nextXmas)   // 1
  //val months: Long = MONTHS.between(now, nextXmas)  // 23



  //imprime solo hora minuto
  import java.time.LocalTime
  import java.time.format.DateTimeFormatter

  val t = LocalTime.now
  val f = DateTimeFormatter.ofPattern("h:mm a")
  println(f.format(t))   // 6:48 PM

}
