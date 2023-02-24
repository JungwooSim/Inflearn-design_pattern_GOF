package behavioral.command

interface Command {
  fun execute()

  fun undo()
}
