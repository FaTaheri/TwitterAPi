import twitter4j.*;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;
import twitter4j.Status;
import twitter4j.conf.ConfigurationBuilder;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
public class API3 {
    public static void main(String[] args) throws TwitterException, IOException {

        ConfigurationBuilder cb = new ConfigurationBuilder();
        cb.setDebugEnabled(true)
                .setOAuthConsumerKey("w7AqK8l1YpqXBvfwbGExX8AAN")
                .setOAuthConsumerSecret("gh0Np1jP80y9myNx8kgjA6xuyrzmHxjecWYc0pV302xb8KTrdE")
                .setOAuthAccessToken("1529813067667759104-2l6fQtFJhoGvIoUVcR42S3N8vLWYTi")
                .setOAuthAccessTokenSecret("8Cl27bXzQ2iUNh3hox4Gn5Gc8FCZNrOMHs6DXLvBGlgjR");
        TwitterFactory tf = new TwitterFactory(cb.build());
        final Twitter twitter = tf.getInstance();
        Query query = new Query("کنکور");
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("result.txt",true));
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    QueryResult result = twitter.search(query);
                    for (Status status : result.getTweets()) {
                        System.out.println("@" + status.getUser().getScreenName() + ":" + status.getText());
                        try {
                            bufferedWriter.write("@" + status.getUser().getScreenName() + ":\n" + status.getText()+
                                    "\n");
                            bufferedWriter.newLine();
                            bufferedWriter.write(status.getUser().getProfileImageURL());
                            bufferedWriter.newLine();
                            bufferedWriter.write(status.getUser().getDescription());
                            bufferedWriter.newLine();
                            bufferedWriter.write(status.getUser().getLocation());
                            bufferedWriter.newLine();
                            bufferedWriter.write(status.getUser().getFollowersCount());
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    try {
                        bufferedWriter.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } catch (TwitterException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        }).start();}}