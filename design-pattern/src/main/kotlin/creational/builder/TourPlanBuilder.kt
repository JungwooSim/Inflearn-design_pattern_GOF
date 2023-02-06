package creational.builder

import java.time.LocalDate

interface TourPlanBuilder {

  fun nightAndDays(nights: Int, days: Int): TourPlanBuilder

  fun title(title: String): TourPlanBuilder

  fun startDate(localDate: LocalDate): TourPlanBuilder

  fun whereToStay(whereToStay: String): TourPlanBuilder

  fun addPlan(day: Int, plan: Int): TourPlanBuilder

  fun getPlan(): TourPlan
}