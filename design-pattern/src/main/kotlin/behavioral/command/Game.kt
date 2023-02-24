package behavioral.command

class Game(
  var isStarted: Boolean?
) {

  fun start() {
    println("게임을 시작합니다.")
    this.isStarted = true
  }

  fun end() {
    println("게임을 종료합니다.")
    this.isStarted = false
  }

  fun isStarted(): Boolean = this.isStarted!!
}
