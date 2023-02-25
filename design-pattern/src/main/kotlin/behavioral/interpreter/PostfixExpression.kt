package behavioral.interpreter

interface PostfixExpression {

  fun interpret(context: Map<Char, Int>): Int

}