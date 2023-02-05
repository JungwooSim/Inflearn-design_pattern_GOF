package creational.abstract_factory

class WhiteshipPartsProFactory : ShipPartsFactory {

  override fun createAnchor(): Anchor {
    return WhiteAnchorPro()
  }

  override fun createWheel(): Wheel {
    return WhiteWheelPro()
  }

}