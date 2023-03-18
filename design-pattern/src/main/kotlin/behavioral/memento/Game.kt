package behavioral.memento

class Game(
  var redTeamScore: Int,
  var blueTeamScore: Int,
) {
  fun save(): GameSave {
    return GameSave(
      blueTeamScore = blueTeamScore,
      redTeamScore = redTeamScore
    )
  }

  fun restore(gameSave: GameSave) {
    this.redTeamScore = gameSave.redTeamScore
    this.blueTeamScore = gameSave.blueTeamScore
  }
}