package creational.factorymethod

class WhiteShipFactory : ShipFactory {

  override fun createShip(): Ship {
    return WhiteShip()
  }

  override fun sendEmail(email: String, ship: Ship) {
    println("${ship.name} 다 만들었습니다.")
  }
}