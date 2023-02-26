package behavioral.iterator

class Board {

  val posts = ArrayList<Post>()

  fun getPosts(): List<Post> {
    return posts
  }

  fun addPost(content: String) {
    this.posts.add(Post(title = content))
  }

  fun getRecentPostIterator(): Iterator<Post> {
    return RecentPostIterator(this.posts)
  }
}
