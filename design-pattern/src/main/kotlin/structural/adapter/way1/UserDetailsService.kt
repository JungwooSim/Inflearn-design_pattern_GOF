package structural.adapter.way1

interface UserDetailsService {

  fun loadUser(username: String): UserDetails
}
