package simulado_q1;

public class  User {
    private String name;
    private java.util.LinkedList<Tweet> tweets;

    public User(String name) {
        this.name = name;
        this.tweets = new java.util.LinkedList<Tweet>();
    }

    public void addTweet(Tweet tweet){
        tweets.add(tweet);
    }

    public int getTweetsLenght(){
        int n = 0;

        for(Tweet i : tweets){
            n += i.getSize();
        }

        return n;
    }

    public int getQttTweets(){
        return tweets.size();
    }
    

    
}
