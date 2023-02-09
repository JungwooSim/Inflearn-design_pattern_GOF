package structural.adapter.way2

class AccountService : UserDetailsService {

  fun findAccountByUsername(username: String): Account {
    val account = Account(
      name1 = username,
      password1 = username,
      email = username,
    )
    return account
  }

  fun createNewAccount(account: Account) {

  }

  fun updateAccount(account: Account) {

  }

  override fun loadUser(username: String): UserDetails {
    return this.findAccountByUsername(username)
  }
}
