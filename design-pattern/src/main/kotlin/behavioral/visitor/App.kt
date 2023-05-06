package behavioral.visitor

fun main() {
  val circle = Circle()
  val pad = Pad()
  circle.accept(pad)

  val triangle = Triangle()
  val phone = Phone()
  triangle.accept(phone)
}