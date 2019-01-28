@groovy.transform.ToString
class Tweet {
  String username     // @therealjameshippler
  String text
  Integer retweets
  Integer favorites
  Date createdOn
  Integer char_count

  public Tweet(String user, String tweet) {
    username = user
    text = tweet
    retweets = 0
    favorites = 0
    char_count = text.length()
    createdOn = new Date()
  }

  void addToRetweets() {
    retweets += 1
  }

  void addToFavorites() {
    favorites += 1
  }
}
