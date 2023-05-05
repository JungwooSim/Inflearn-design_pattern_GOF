package behavioral.template

fun main() {
    val multiply = Multiply(path = "TEST")
    val multiplyResult = multiply.process()
    println(multiplyResult)

    val plus = Plus(path = "TEST")
    val plusResult = plus.process()
    println(plusResult)
}