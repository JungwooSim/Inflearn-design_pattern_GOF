package behavioral.observer

class User (
  val name: String
) : Subscriber {
  override fun handleMessage(message: String) {
    println(message)
  }
}