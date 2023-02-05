package creational.abstract_factory

interface ShipPartsFactory {

  fun createAnchor(): Anchor

  fun createWheel(): Wheel
}