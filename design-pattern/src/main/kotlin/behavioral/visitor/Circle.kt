package behavioral.visitor

class Circle : Shape {
  override fun accept(device: Device) {
    device.print(this)
  }
}