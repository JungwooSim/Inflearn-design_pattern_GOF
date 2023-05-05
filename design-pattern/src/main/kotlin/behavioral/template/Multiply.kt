package behavioral.template

class Multiply(
  path: String,
) : FileProcessor(path = path) {

    override fun getResult(result: Int, number: Int): Int {
        return result * number
    }
}