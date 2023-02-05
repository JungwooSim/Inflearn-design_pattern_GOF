package creational.factorymethod

import creational.abstract_factory.Anchor
import creational.abstract_factory.Wheel

open class Ship(
  val name: String,
  val color: String,
  val logo: String,
  var wheel: Wheel ?= null,
  var anchor: Anchor ?= null
) {
  override fun toString(): String {
    return "name : ${name}, color : ${color}, logo : ${logo}"
  }
}