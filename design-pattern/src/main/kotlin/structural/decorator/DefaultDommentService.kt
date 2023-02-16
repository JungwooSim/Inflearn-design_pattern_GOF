package structural.decorator

class DefaultDommentService : CommentService {

  override fun addComment(comment: String) {
    println(comment)
  }
}
