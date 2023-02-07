package creational.prototype

import java.util.Objects

class GithubIssue(
  var id: Int ?= null,
  var title: String ?= null,
  var repository: GithubRepository
) : Cloneable {

  fun getUrl(): String {
    return "https://github.com/${repository.user}/${repository.name}/issues/${this.id}"
  }

  public override fun clone(): Any {
    val repository = GithubRepository()
    repository.user = this.repository.user
    repository.name = this.repository.name

    val githubIssue = GithubIssue(repository = repository)
    githubIssue.id = this.id
    githubIssue.title = this.title

    return githubIssue
  }

  override fun equals(o: Any?): Boolean {
    if (this === o) return true
    if (o == null || javaClass != o.javaClass) return false
    val that = o as GithubIssue
    return id == that.id && title == that.title && repository == that.repository
  }

  override fun hashCode(): Int {
    return Objects.hash(id, title, repository)
  }
}