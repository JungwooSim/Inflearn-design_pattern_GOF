package structural.adapter.way1

class AccountUserDetails(private val account: Account) : UserDetails {
  override fun getUsername(): String {
    return account.name!!
  }

  override fun getPassword(): String {
    return account.password!!
  }
}
