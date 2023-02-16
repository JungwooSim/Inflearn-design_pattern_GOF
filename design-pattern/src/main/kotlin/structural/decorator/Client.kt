package structural.decorator

class Client(
  private val commentService: CommentService
) {
  fun writeComment(comment: String) {
    commentService.addComment(comment)
  }
}
