package structural.decorator

class TrimmingCommentDecorator(commentService: CommentService) : CommentDecorator(commentService = commentService) {

  override fun addComment(comment: String) {
    super.addComment(trim(comment))
  }

  fun trim(comment: String): String {
    return comment.replace("...", "")
  }
}
