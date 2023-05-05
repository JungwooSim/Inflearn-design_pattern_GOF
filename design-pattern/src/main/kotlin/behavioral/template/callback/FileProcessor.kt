package behavioral.template.callback

import java.io.BufferedReader
import java.io.FileReader
import java.io.IOException

class FileProcessor(
  val path: String,
) {
  fun process(operator: Operator): Int {
    try {
      BufferedReader(FileReader(path)).use { reader ->
        var result = 0
        var line: String? = null
        while (reader.readLine().also { line = it } != null) {
          result = operator.getResult(result, line!!.toInt())
        }
        return result
      }
    } catch (e: IOException) {
      throw IllegalArgumentException(path + "에 해당하는 파일이 없습니다.", e)
    }
  }
}