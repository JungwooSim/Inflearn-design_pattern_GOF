package structural.decorator

class SpamFilteringCommentDecorator(commentService: CommentService) : CommentDecorator(commentService = commentService) {

  private fun isNotSpam(comment: String): Boolean {
    return !comment.contains("http")
  }

  override fun addComment(comment: String) {
    if (isNotSpam(comment)) {
      super.addComment(comment = comment)
    }
  }
}
