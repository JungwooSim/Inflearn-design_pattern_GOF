package creational.factorymethod

fun main() {

  val whiteShipFactory = WhiteShipFactory()
  val whiteShip: Ship = whiteShipFactory.orderShip("WhiteShip", "aa@gmail.com")
  println(whiteShip.toString())

  val blackShipFactory = BlackShipFactory()
  val blackShip: Ship = blackShipFactory.orderShip("BlackShip", "aa@gmail.com")
  println(blackShip.toString())
}