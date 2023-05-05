package behavioral.template

class Plus(
  path: String
) : FileProcessor(path = path) {

    override fun getResult(result: Int, number: Int): Int {
        return result * number
    }
}