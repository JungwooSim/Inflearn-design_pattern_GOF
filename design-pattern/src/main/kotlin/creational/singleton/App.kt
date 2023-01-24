package creational.singleton

class App {

}

fun main() {
  val settings1 = Settings.getInstance()
  val settings2 = Settings.getInstance()

  println(settings1 == settings2)
}