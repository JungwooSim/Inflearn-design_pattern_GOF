package creational.factorymethod

fun main() {
  print(WhiteShipFactory(), "WhiteShip", "aa@gmail.com")
  print(BlackShipFactory(), "BlackShip", "aa@gmail.com")
}

fun print(shipFactory: ShipFactory, name: String, email: String) {
  val whiteShip: Ship = shipFactory.orderShip(name, email)
  println(whiteShip.toString())
}
