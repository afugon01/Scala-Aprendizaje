package inicio
package Numbers_Dates

import java.time._

object Fechas extends App{


  LocalDate.now       // 2019-01-20
  LocalTime.now       // 12:19:26.270
  println(LocalDateTime.now )  // 2019-01-20T12:19:26.270
  println(Instant.now     )    // 2019-01-20T19:19:26.270Z
  println(ZonedDateTime.now)   // 2019-01-20T12:44:53.466-07:00[America/Denver]



  //crear fechas
  //val squirrelDay = LocalDate.of(2020, 1, 21)
  //val squirrelDay = LocalDate.of(2020, Month.JANUARY, 21)
  val squirrelDay = LocalDate.of(2020, 1, 1).plusDays(20)
  println(squirrelDay)


  //otros constructores
  //LocalDateTime.of(year: Int, month: Int, dayOfMonth: Int, hour: Int, minute: Int)
  //LocalDateTime.of(year: Int, month: Month, dayOfMonth: Int, hour: Int, minute: Int)
  //LocalDateTime.of(date: LocalDate, time: LocalTime)


  //val zdt = ZonedDateTime.of(
    //LocalDate.now,
    //LocalTime.now,
    //ZoneId.of("America/New_York")
  //)
  // result: 2019-01-20T13:05:28.119-05:00[America/New_York]

}
