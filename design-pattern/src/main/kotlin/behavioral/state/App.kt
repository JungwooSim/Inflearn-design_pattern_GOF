package behavioral.state

fun main() {
  val onlineCourse = OnlineCourse(state = null)
  val student1 = Student(name = "ray")
  val student2 = Student(name = "big")
  student2.addPrivate(onlineCourse = onlineCourse)

  onlineCourse.addStudent(student1)

  onlineCourse.changeState(Private(onlineCourse))

  onlineCourse.addReview("hello", student1)

  onlineCourse.addStudent(student2)

  println(onlineCourse.state)
  println(onlineCourse.reviews)
  println(onlineCourse.students)
}