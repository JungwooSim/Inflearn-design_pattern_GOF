package behavioral.mediator

import java.time.LocalDateTime

class FrontDesk {

  private val cleaningService: CleaningService = CleaningService()

  private val restaurant = Restaurant()

  fun getTowers(guest: Guest, numberOfTowers: Int) {
    cleaningService.getTowers(
      guestId = guest.id!!,
      numberOfTowers = numberOfTowers
    )
  }

  fun getRoomNumberFor(guestId: Int): String {
    return "11"
  }

  fun dinner(guest: Guest, dateTime: LocalDateTime?) {
    restaurant.dinner(guest.id!!, dateTime!!)
  }

}
