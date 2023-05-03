package behavioral.strategy

fun main() {
  val game = BlueLightRedLight()

  game.blueLight(Normal())
  game.redLight(Fastest())
  game.blueLight(
    object : Speed {
      override fun blueLight() {
        println("blue light")
      }

      override fun redLight() {
        println("red light")
      }
    }
  )
}