package structural.composite

class Item(
  private val name: String,
  private val price: Int
) : Component {

  override fun getPrice(): Int {
    return this.price
  }
}
