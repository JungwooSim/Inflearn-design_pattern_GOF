package behavioral.state

class Student(
  val name: String,
  val onlineCourses: MutableSet<OnlineCourse> = mutableSetOf()
) {
  fun isAvailable(onlineCourse: OnlineCourse): Boolean {
    return this.onlineCourses.contains(onlineCourse)
  }

  fun addPrivate(onlineCourse: OnlineCourse) {
    this.onlineCourses.add(onlineCourse)
  }
}
