package behavioral.state

class Published(
  val onlineCourse: OnlineCourse
) : State {
  override fun addReview(review: String, student: Student) {
    this.onlineCourse.reviews.add(review)
  }

  override fun addStudent(student: Student) {
    this.onlineCourse.students.add(student)
  }
}