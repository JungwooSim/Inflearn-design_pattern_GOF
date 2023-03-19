package behavioral.observer

interface Subscriber {

  fun handleMessage(message :String)
}