package behavioral.observer

class ChatServer(
  val subscribers: MutableMap<String, MutableList<Subscriber>> = mutableMapOf()
) {

  fun register(subject: String, subscriber: Subscriber) {
    if (this.subscribers.containsKey(subject)) {
      this.subscribers[subject]?.add(subscriber)
    } else {
      val list = mutableListOf<Subscriber>()
      list.add(subscriber)
      this.subscribers[subject] = list
    }
  }

  fun unregister(subject: String, subscriber: Subscriber) {
    this.subscribers[subject]?.remove(subscriber)
  }

  fun sendMessage(user: User, subject: String, message: String) {
    if (this.subscribers.containsKey(subject)) {
      this.subscribers[subject]?.forEach {
        it.handleMessage("${user.name} : ${message}")
      }
    }
  }
}