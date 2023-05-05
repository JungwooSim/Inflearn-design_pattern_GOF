package behavioral.template.callback

class Multiply : Operator {

    override fun getResult(result: Int, number: Int): Int {
        return result * number
    }
}