package behavioral.chain_of_responsibility

class PrintRequestHandler(nextHandler: RequestHandler?) : RequestHandler(nextHandler) {

  override fun handle(request: Request) {
    println(request.body)
    super.handle(request)
  }
}