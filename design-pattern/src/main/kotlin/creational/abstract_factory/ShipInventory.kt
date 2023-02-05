package creational.abstract_factory

import creational.factorymethod.Ship
import creational.factorymethod.ShipFactory

class ShipInventory {
}

fun main() {

//  val shipFactory: ShipFactory = WhiteShipFactory(WhiteshipPartsFactory()) // 필요에 따라 변경하여 사용가능
  val shipFactory: ShipFactory = WhiteShipFactory(WhiteshipPartsProFactory()) // 필요에 따라 변경하여 사용가능
  val ship: Ship = shipFactory.createShip()
  println(ship.anchor!!.javaClass)
  println(ship.wheel!!.javaClass)
}