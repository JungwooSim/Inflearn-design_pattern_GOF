package behavioral.iterator

import java.time.LocalDateTime

class Post(
  val title: String,
  val createdDateTime: LocalDateTime = LocalDateTime.now(),
)