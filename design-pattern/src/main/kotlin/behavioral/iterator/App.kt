package behavioral.iterator

fun main() {
  val board = Board()
  board.addPost("디자인 패턴 게임")
  board.addPost("선생님, 저랑 디자인 패턴 하나 학습하시겠습니까?")
  board.addPost("지금 이 자리에 계신 여러분들은 모두 디자인 패턴을 학습하고 계신 분들입니다.")

  val posts = board.getPosts()
  val iterator = posts.iterator()

  for (i in posts.indices) {
    val post = posts[i]
    println(post.title)
  }

  val recentPostIterator = board.getRecentPostIterator()
  while (recentPostIterator.hasNext()) {
    println(recentPostIterator.next().title)
  }
}