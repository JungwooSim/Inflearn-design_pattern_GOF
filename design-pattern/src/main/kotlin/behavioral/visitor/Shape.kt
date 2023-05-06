package behavioral.visitor

interface Shape {
  fun accept(device: Device)
}