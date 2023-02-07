package creational.prototype

class App {
}

fun main() {
  val repository = GithubRepository()
  repository.user = "big"
  repository.name = "libe-study"

  val githubIssue = GithubIssue(repository = repository)
  githubIssue.id = 1
  githubIssue.title = "1주차 과제: JVM은 무엇이며 자바 코드는 어떻게 실행하는 것인가."

  val url: String = githubIssue.getUrl()
  println(url)

  val clone = githubIssue.clone() as GithubIssue
  println(clone.getUrl())

  repository.user = "sim"

  println(clone != githubIssue)
  println(clone.equals(githubIssue))
  println(clone.javaClass == githubIssue.javaClass)
  println(clone.repository == githubIssue.repository)

  println(clone.getUrl())
}