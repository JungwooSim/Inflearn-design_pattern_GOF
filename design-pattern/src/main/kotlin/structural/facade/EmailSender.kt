package structural.facade

class EmailSender(
  val emailSettings: EmailSettings
) {

  fun sendEmail(emailMessage: EmailMessage) {
    val properties = System.getProperties()
    properties.setProperty("mail.smtp.host", emailSettings.host)

    try {
      //TODO : send
    } catch (e: IllegalArgumentException) {
      e.printStackTrace()
    }
  }
}
