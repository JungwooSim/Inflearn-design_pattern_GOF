package structural.proxy

fun main() {
  val gameService = GameServiceProxy(null)
  gameService.startGame()
}