package behavioral.visitor

class Rectangle : Shape {
  override fun accept(device: Device) {
    device.print(this)
  }
}