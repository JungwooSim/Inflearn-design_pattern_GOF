package behavioral.interpreter

import java.util.*

class PostfixParser {

  companion object {
    fun parse(expression: String): PostfixExpression {
      val stack = Stack<PostfixExpression>()

      for (c in expression.toCharArray()) {
        stack.push(getExpression(c, stack))
      }

      return stack.pop()
    }

    private fun getExpression(c: Char, stack: Stack<PostfixExpression>): PostfixExpression {
      when (c) {
        '+' -> PlusExpression(stack.pop(), stack.pop())
        '-' -> {
          val right = stack.pop()
          val left = stack.pop()
          return MinusExpression(left, right)
        }
      }
      return VariableExpression(c)
    }
  }

}
