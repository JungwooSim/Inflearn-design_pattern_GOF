package behavioral.command

class GameEndCommand(val game: Game) : Command {
  override fun execute() {
    this.game.end()
  }

  override fun undo() {
    GameStartCommand(this.game).execute()
  }
}