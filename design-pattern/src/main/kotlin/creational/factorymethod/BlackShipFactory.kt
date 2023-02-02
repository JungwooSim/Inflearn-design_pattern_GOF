package creational.factorymethod

class BlackShipFactory : ShipFactory {

  override fun createShip(): Ship {
    return BlackShip()
  }

  override fun sendEmail(email: String, ship: Ship) {
    println("${ship.name} 다 만들었습니다.")
  }
}