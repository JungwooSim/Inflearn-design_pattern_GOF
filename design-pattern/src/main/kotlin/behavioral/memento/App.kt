package behavioral.memento

fun main() {
  val game: Game = Game(
    redTeamScore = 20,
    blueTeamScore = 10
  )

  val save: GameSave = game.save()

  game.blueTeamScore = 12
  game.redTeamScore = 22

  game.restore(gameSave = save)

  println(game.blueTeamScore)
  println(game.redTeamScore)
}