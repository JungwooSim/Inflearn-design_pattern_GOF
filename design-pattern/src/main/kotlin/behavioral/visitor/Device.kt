package behavioral.visitor

interface Device {
  fun print(circle: Circle)

  fun print(rectangle: Rectangle)

  fun print(triangle: Triangle)
}