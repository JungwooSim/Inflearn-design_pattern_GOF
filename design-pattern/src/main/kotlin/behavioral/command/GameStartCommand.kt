package behavioral.command

class GameStartCommand(val game: Game) : Command {
  override fun execute() {
    this.game.start()
  }

  override fun undo() {
    GameEndCommand(this.game).execute()
  }
}
