package behavioral.mediator

class CleaningService {

  private val frontDesk: FrontDesk = FrontDesk()

  fun getTowers(guestId: Int, numberOfTowers: Int) {
    val roomNumber = this.frontDesk.getRoomNumberFor(guestId)
    println("provide $numberOfTowers to $roomNumber")
  }
}
