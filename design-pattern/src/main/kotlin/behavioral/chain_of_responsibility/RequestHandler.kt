package behavioral.chain_of_responsibility

abstract class RequestHandler(
  val nextHandler: RequestHandler?
) {
  open fun handle(request: Request) {
    nextHandler?.handle(request)
  }

}
