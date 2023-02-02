package creational.factorymethod

interface ShipFactory {

  fun orderShip(name: String, email: String): Ship {
    validate(name, email)
    prepareFor(name)
    val ship: Ship = createShip()
    sendEmail(email, ship)
    return ship
  }

  fun createShip(): Ship

  fun sendEmail(email: String, ship: Ship)

  fun prepareFor(name: String) {
    println("$name 만들 준비 중")
  }

  fun validate(name: String, email: String) {
    if (name.isBlank()) {
      throw IllegalArgumentException("배 이름을 지어주세요.")
    }

    if (email.isBlank()) {
      throw IllegalArgumentException("연락처를 남겨주세요.")
    }
  }
}