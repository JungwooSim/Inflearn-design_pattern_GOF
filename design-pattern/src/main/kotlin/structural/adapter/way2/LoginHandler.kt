package structural.adapter.way2

class LoginHandler(private val accountService: AccountService) {

  fun login(username: String, password: String): String {
    val userDetails = accountService.loadUser(username)

    if (userDetails.getPassword() == password) {
      return userDetails.getUsername()
    } else {
      throw IllegalArgumentException()
    }
  }
}
