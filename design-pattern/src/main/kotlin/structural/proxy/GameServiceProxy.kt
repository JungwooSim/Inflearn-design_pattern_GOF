package structural.proxy

class GameServiceProxy(var gameService: GameService?) : GameService {
  override fun startGame() {
    val before: Long = System.currentTimeMillis()
    if (gameService == null) {
      gameService = DefaultGameService()
    }

    gameService!!.startGame()
    println(System.currentTimeMillis() - before)
  }
}
