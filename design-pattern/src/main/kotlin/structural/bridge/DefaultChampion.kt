package structural.bridge

open class DefaultChampion(
  val skin: Skin,
  val pName: String = ""
) : Champion {

  override fun skillQ() {
    println("${skin.getName()} ${this.getName()} skill - Q")
  }

  override fun skillW() {
    println("${skin.getName()} ${this.getName()} skill - W")
  }

  override fun skillE() {
    println("${skin.getName()} ${this.getName()} skill - E")
  }

  override fun getName(): String {
    return this.pName
  }
}
