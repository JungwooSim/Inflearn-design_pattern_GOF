package behavioral.command

fun main() {
  val button = Button()
  button.press(GameStartCommand(Game(null)))
  button.press(LightOnCommand(Light(null)))
  button.undo()
  button.undo()
}