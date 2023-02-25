package behavioral.interpreter

class VariableExpression(
  private val character: Char
) : PostfixExpression {

  override fun interpret(context: Map<Char, Int>): Int {
    return context[character]!!
  }
}
