package structural.adapter.way2

fun main() {
  val accountService = AccountService()
  val loginHandler = LoginHandler(accountService)
  val login: String = loginHandler.login("big", "big")
  println(login)
}