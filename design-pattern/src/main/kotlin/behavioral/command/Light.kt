package behavioral.command

class Light(var isOn: Boolean?) {

  fun on() {
    println("불을 켭니다.")
    this.isOn = true
  }

  fun off() {
    println("불을 끕니다.")
    this.isOn = false
  }

  fun isOn(): Boolean = this.isOn()
}
