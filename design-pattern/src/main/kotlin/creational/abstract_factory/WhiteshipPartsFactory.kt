package creational.abstract_factory

class WhiteshipPartsFactory : ShipPartsFactory {
  override fun createAnchor(): Anchor {
    return WhiteAnchor()
  }

  override fun createWheel(): Wheel {
    return WhiteWheel()
  }
}