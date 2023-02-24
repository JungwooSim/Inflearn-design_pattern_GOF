package behavioral.command

class LightOffCommand(val light: Light) : Command {
  override fun execute() {
    light.off()
  }

  override fun undo() {
    LightOnCommand(light).execute()
  }
}