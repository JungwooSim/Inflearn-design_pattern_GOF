package structural.decorator

fun main() {
  val enabledSpamFilter = true
  val enabledTrimming = true

  var commentService: CommentService = DefaultDommentService()

  if (enabledSpamFilter) {
    commentService = SpamFilteringCommentDecorator(commentService)
  }

  if (enabledTrimming) {
    commentService = TrimmingCommentDecorator(commentService)
  }

  val client = Client(commentService)
  client.writeComment("오징어게임")
  client.writeComment("보는게 하는거 보다 재밌을 수가 없지...")
  client.writeComment("http://naver.com")
}