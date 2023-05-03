package behavioral.strategy

class Fastest : Speed {
  override fun blueLight() {
    println("무광꼬치")
  }

  override fun redLight() {
    println("피어씀다.")
  }
}