package behavioral.chain_of_responsibility

class LoggingRequestHandler(nextHandler: RequestHandler?) : RequestHandler(nextHandler) {

  override fun handle(request: Request) {
    println("로깅")
    super.handle(request)
  }
}