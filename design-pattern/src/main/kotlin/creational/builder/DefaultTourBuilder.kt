package creational.builder

import java.time.LocalDate

class DefaultTourBuilder(
  var title: String = "",
  var nights: Int = 0,
  var days: Int = 0,
  var startDate: LocalDate = LocalDate.now(),
  var whereToStay: String = "",
  var plans: List<DetailPlan> = arrayListOf()
) : TourPlanBuilder {
  override fun nightAndDays(nights: Int, days: Int): TourPlanBuilder {
    this.nights = nights
    this.days = days
    return this
  }

  override fun title(title: String): TourPlanBuilder {
    this.title = title
    return this
  }

  override fun startDate(localDate: LocalDate): TourPlanBuilder {
    this.startDate = localDate
    return this
  }

  override fun whereToStay(whereToStay: String): TourPlanBuilder {
    this.whereToStay = whereToStay
    return this
  }

  override fun addPlan(day: Int, plan: Int): TourPlanBuilder {
    this.days = day
//    this.plans = plans
    return this
  }

  override fun getPlan(): TourPlan {
    return TourPlan(
      title = title,
      nights = nights,
      days = days,
      startDate = startDate,
      whereToStay = whereToStay,
      plans = plans
    )
  }
}