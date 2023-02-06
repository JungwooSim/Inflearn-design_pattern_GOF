package creational.builder

import java.time.LocalDate

class TourPlan(
  val title: String,
  val nights: Int,
  val days: Int,
  val startDate: LocalDate,
  val whereToStay: String,
  val plans: List<DetailPlan>
)