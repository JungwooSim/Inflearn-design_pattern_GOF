package behavioral.state

interface State {

  fun addReview(review: String, student: Student)

  fun addStudent(student: Student)

}
