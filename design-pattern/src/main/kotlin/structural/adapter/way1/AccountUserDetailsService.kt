package structural.adapter.way1

class AccountUserDetailsService(val accountService: AccountService) : UserDetailsService {

  override fun loadUser(username: String): UserDetails {
    return AccountUserDetails(account =  accountService.findAccountByUsername(username))
  }
}
