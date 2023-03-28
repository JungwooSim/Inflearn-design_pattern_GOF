package behavioral.state

class OnlineCourse(
  var state: State?,
  val students: MutableList<Student> = mutableListOf(),
  val reviews: MutableList<String> = mutableListOf(),
) {
  init {
    this.state = Draft(this)
  }

  fun addStudent(student: Student) {
    this.state!!.addStudent(student = student)
  }

  fun addReview(review: String, student: Student) {
    this.state!!.addReview(review = review, student = student)
  }

  fun changeState(state: State) {
    this.state = state
  }
}
