package behavioral.observer

fun main() {
  val chatServer: ChatServer = ChatServer()
  val user1 = User("big")
  val user2 = User("big-2")

  chatServer.register("오징어게임", user1)
  chatServer.register("오징어게임", user2)
  chatServer.register("디자인패턴", user1)

  chatServer.sendMessage(
    user = user1,
    subject = "오징어게임",
    message = "aaaaaaaa"
  )

  chatServer.sendMessage(
    user = user2,
    subject = "디자인패턴",
    message = "bbbbbbb"
  )

  chatServer.unregister(
    subject = "디자인패턴",
    subscriber = user2
  )

  chatServer.sendMessage(
    user = user2,
    "디자인패턴",
    message = "reading"
  )
}