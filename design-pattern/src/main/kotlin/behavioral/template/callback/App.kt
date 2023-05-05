package behavioral.template.callback

fun main() {
  val multiply = FileProcessor(path = "TEST")

  val multiplyResult = multiply.process(
      operator = Multiply()
  )
  println(multiplyResult)

  val plusResult = FileProcessor(path = "TEST").process(
      operator = object : Operator {
          override fun getResult(result: Int, number: Int): Int = result + number
      }
  )
  println(plusResult)
}