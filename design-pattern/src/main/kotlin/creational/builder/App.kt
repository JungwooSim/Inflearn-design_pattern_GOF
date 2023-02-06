package creational.builder

class App {
}

fun main() {
  val builder: TourPlanBuilder = DefaultTourBuilder()

  val plan: TourPlan = builder.title("title")
    .nightAndDays(10, 10)
    .whereToStay("리조트")
    .getPlan()

  println(plan.title)
}