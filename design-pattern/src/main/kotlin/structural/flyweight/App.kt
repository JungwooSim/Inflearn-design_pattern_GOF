package structural.flyweight

import structural.flyweight.Character as char
fun main() {
  val fontFactory = FontFactory()

  val c1 = char(
    value = 'h',
    color = "white",
    fontFactory.getFont("nanum:12")
  )
  val c2 = char(
    value = 'h',
    color = "white",
    fontFactory.getFont("nanum:12")
  )
  val c3 = char(
    value = 'h',
    color = "white",
    fontFactory.getFont("nanum:12")
  )
}