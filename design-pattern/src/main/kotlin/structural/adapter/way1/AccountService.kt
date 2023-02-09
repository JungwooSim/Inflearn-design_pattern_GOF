package structural.adapter.way1

class AccountService {

  fun findAccountByUsername(username: String): Account {
    val account = Account(
      name = username,
      password = username,
      email = username,
    )
    return account
  }

  fun createNewAccount(account: Account) {

  }

  fun updateAccount(account: Account) {

  }
}
