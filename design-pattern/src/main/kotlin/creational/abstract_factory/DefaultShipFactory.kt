package creational.abstract_factory

import creational.factorymethod.Ship
import creational.factorymethod.ShipFactory

abstract class DefaultShipFactory : ShipFactory {

  override fun sendEmail(email: String, ship: Ship) {
    println("${ship.name} 다 만들었습니다.")
  }
}