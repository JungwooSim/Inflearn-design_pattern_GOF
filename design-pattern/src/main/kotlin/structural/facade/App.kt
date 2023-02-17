package structural.facade

fun main() {
  val emailSettings = EmailSettings()
  emailSettings.host = "127.0.0.1"

  val emailSender = EmailSender(emailSettings)
  val emailMessage = EmailMessage(
    from = "from",
    to = "to",
    cc = "cc",
    subject = "subject",
    text = "text",
    bcc = "bcc"
  )

  emailSender.sendEmail(emailMessage)
}