package behavioral.visitor

class Triangle : Shape {
  override fun accept(device: Device) {
    device.print(this)
  }
}