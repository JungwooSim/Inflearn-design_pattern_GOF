package behavioral.state

class Draft(
  val onlineCourse: OnlineCourse
) : State {
  override fun addReview(review: String, student: Student) {
    throw UnsupportedOperationException("드래프트 상태에서는 리뷰를 남길 수 없습니다.")
  }

  override fun addStudent(student: Student) {
    this.onlineCourse.students.add(student)
  }

}
