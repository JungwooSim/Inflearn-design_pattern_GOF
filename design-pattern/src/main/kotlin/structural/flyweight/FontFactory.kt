package structural.flyweight

class FontFactory(
  var cache: HashMap<String, CustomFont> = HashMap()
) {

  fun getFont(font: String): CustomFont {
    if (cache.containsKey(font)) {
      return cache[font]!!
    } else {
      val split: List<String> = font.split(":")
      val newFont = CustomFont(family = split[0], Integer.parseInt(split[1]))
      this.cache[font] = newFont
      return newFont
    }
  }
}
