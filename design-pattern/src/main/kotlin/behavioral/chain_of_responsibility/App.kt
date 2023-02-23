package behavioral.chain_of_responsibility

fun main() {
  val chain = AuthRequestHandler(LoggingRequestHandler(PrintRequestHandler(null)))

  val client = Client(chain)
  client.doWork()
}