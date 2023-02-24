package behavioral.command

import java.util.*

class Button {

  val commands = Stack<Command>()

  fun press(command: Command) {
    command.execute()
    commands.push(command)
  }

  fun undo() {
    if (commands.isNotEmpty()) {
      val command = commands.pop()
      command.undo()
    }
  }

}
