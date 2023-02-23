package behavioral.chain_of_responsibility

class AuthRequestHandler(nextHandler: RequestHandler) : RequestHandler(nextHandler) {

  override fun handle(request: Request) {
    println("인증이 되었나")
    println("이 핸들러를 사용할 수 있나?")
    super.handle(request)
  }
}