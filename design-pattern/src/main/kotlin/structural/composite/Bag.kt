package structural.composite

class Bag : Component {

  val components = ArrayList<Component>()

  fun add(component: Component) {
    this.components.add(component)
  }

  override fun getPrice(): Int {
    return components.stream().mapToInt(Component::getPrice).sum()
  }
}
