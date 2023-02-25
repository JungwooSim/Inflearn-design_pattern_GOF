package behavioral.interpreter

fun main() {
  val expression = PostfixParser.parse("xyz+-a+")
  val result = expression.interpret(
    mapOf(
      'x' to 1,
      'y' to 2,
      'z' to 3,
      'a' to 4,
    )
  )
  println(result)
}