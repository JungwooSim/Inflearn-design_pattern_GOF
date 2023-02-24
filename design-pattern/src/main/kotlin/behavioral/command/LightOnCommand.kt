package behavioral.command

class LightOnCommand(val light: Light) : Command {
  override fun execute() {
    this.light.on()
  }

  override fun undo() {
    LightOffCommand(this.light).execute()
  }
}
