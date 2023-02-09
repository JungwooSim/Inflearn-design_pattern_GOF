package structural.adapter.way2

class Account(
  var name1: String? = null,
  var password1: String? = null,
  var email: String? = null,
) : UserDetails {
  override fun getUsername(): String {
    return this.name1!!
  }

  override fun getPassword(): String {
    return this.password1!!
  }
}
