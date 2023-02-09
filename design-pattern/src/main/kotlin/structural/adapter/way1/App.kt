package structural.adapter.way1

fun main() {
  val accountService = AccountService()
  val userDetailsService = AccountUserDetailsService(accountService)
  val loginHandler = LoginHandler(userDetailsService)
  val login: String = loginHandler.login("big", "big")
  println(login)
}