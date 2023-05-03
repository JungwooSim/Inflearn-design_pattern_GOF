package behavioral.strategy

class BlueLightRedLight {
  fun blueLight(speed: Speed) = speed.blueLight()

  fun redLight(speed: Speed) = speed.redLight()
}
