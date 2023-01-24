package creational.singleton

class Settings private constructor() {

  companion object {
    private val instance: Settings = Settings()

    fun getInstance(): Settings {
      return instance
    }
  }
}