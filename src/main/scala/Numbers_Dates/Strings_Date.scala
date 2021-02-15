package inicio
package Numbers_Dates

import java.time.{Instant, LocalDate, LocalDateTime}
import java.util.Date

object Strings_Date extends App {

  //string a fecha
  val d = LocalDate.parse("2010-12-10")
  println(d)


  //darle formato deseado
  import java.time.format.DateTimeFormatter

  val df = DateTimeFormatter.ofPattern("yyyy/MM/dd")
  val d1 = LocalDate.parse("2010/12/10", df)
  println(d1)


  //
  //This example demonstrates the default format for java.time.LocalDateTime:
  val s = "2019-07-22T12:13:14"
  val ldt = LocalDateTime.parse(s)   // 2019-07-22T12:13:14





  // convert Instant to Date
  val instant = Instant.now   // 2019-01-21T03:37:10.780Z
  Date.from(instant)          // java.util.Date = Sun Jan 20 20:37:10 MST 2019

  // convert Date to Instant
  val e = new Date            // Sun Jan 20 20:39:00 MST 2019
  e.toInstant                 // Instant = 2019-01-21T03:39:00.826Z
}
