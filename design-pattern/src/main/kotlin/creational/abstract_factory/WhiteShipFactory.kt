package creational.abstract_factory

import creational.factorymethod.Ship
import creational.factorymethod.WhiteShip

class WhiteShipFactory(
  val shipPartsFactory: ShipPartsFactory
) : DefaultShipFactory() {


  override fun createShip(): Ship {
    val ship: Ship = WhiteShip()
    ship.anchor = shipPartsFactory.createAnchor()
    ship.wheel = shipPartsFactory.createWheel()
    return ship
  }
}
