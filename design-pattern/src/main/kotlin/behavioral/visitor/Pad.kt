package behavioral.visitor

class Pad : Device {
  override fun print(circle: Circle) {
    println("Print Circle to Pad")
  }

  override fun print(rectangle: Rectangle) {
    println("Print Rectangle to Pad")
  }

  override fun print(triangle: Triangle) {
    println("Print Triangle to Pad")
  }
}