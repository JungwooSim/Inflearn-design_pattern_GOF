package structural.adapter.way2

interface UserDetailsService {

  fun loadUser(username: String): UserDetails
}
