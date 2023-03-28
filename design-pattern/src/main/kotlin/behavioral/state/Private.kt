package behavioral.state

class Private(
  val onlineCourse: OnlineCourse
) : State {
  override fun addReview(review: String, student: Student) {
    if (this.onlineCourse.students.contains(student)) {
      this.onlineCourse.reviews.add(review)
    } else {
      throw UnsupportedOperationException("프라이빗 코스를 수강하는 학생만 리뷰를 남길 수 있습니다.")
    }
  }

  override fun addStudent(student: Student) {
    if (student.isAvailable(this.onlineCourse)) {
      this.onlineCourse.students.add(student)
    } else {
      throw UnsupportedOperationException("프라이빛 코스를 수강할 수 없습니다.")
    }
  }
}