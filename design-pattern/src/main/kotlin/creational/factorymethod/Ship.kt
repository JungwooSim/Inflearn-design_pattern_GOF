package creational.factorymethod

open class Ship(
  val name: String,
  val color: String,
  val logo: String,
) {
  override fun toString(): String {
    return "name : ${name}, color : ${color}, logo : ${logo}"
  }
}