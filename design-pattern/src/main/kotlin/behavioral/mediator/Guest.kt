package behavioral.mediator

import java.time.LocalDateTime

class Guest {

  private val frontDesk = FrontDesk()

  var id: Int? = null

  fun getTowers(numberOfTowers: Int) {
    frontDesk.getTowers(this, numberOfTowers)
  }

  private fun dinner(dateTime: LocalDateTime) {
    frontDesk.dinner(this, dateTime)
  }

}
