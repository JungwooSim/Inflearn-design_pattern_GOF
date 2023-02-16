package structural.decorator

open class CommentDecorator(
  private val commentService: CommentService
) : CommentService {

  override fun addComment(comment: String) {
    commentService.addComment(comment)
  }
}
