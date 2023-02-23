package behavioral.chain_of_responsibility

class Client(
  val requestHandler: RequestHandler
) {

  fun doWork() {
    val request = Request("이번 놀이는 뽑기")
    requestHandler.handle(request)
  }
}
