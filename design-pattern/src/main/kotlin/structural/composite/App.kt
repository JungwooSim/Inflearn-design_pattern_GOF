package structural.composite

fun main() {
  val itemA = Item("a", 450)
  val itemB = Item("b", 50)

  val bag = Bag()
  bag.add(itemA)
  bag.add(itemB)

  printPrice(itemA)
  printPrice(itemB)
  printPrice(bag)
}

fun printPrice(component: Component) {
  println(component.getPrice())
}