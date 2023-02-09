package structural.adapter.way1

class LoginHandler(private val userDetailsService: AccountUserDetailsService) {

  fun login(username: String, password: String): String {
    val userDetails = userDetailsService.loadUser(username)

    if (userDetails.getPassword() == password) {
      return userDetails.getUsername()
    } else {
      throw IllegalArgumentException()
    }
  }
}
