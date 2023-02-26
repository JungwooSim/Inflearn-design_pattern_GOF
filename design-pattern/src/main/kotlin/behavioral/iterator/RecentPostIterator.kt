package behavioral.iterator

import java.util.*

class RecentPostIterator(
  val posts: List<Post>
) : Iterator<Post> {

  private var internalIterator: Iterator<Post>? = null

  init {
    Collections.sort(posts, compareByDescending { it.createdDateTime })
    this.internalIterator = posts.iterator()
  }

  override fun hasNext(): Boolean {
    return this.internalIterator!!.hasNext()
  }

  override fun next(): Post {
    return this.internalIterator!!.next()
  }
}
