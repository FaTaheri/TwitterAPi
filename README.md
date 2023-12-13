# TwitterAPi
# API3

This is a simple Java program that uses the Twitter4J library to search for tweets containing the keyword "کنکور" (which translates to "entrance exam" in English) and writes the results to a file called "result.txt". The program also retrieves additional information about the user who posted each tweet, including their profile image URL, description, location, and follower count.

## Getting Started

To use this program, you will need to have a Twitter Developer account and create a new app to obtain the necessary API keys and access tokens. Once you have obtained these credentials, replace the placeholder values in the setOAuthConsumerKey, setOAuthConsumerSecret, setOAuthAccessToken, and setOAuthAccessTokenSecret methods with your actual keys and tokens.

cb.setOAuthConsumerKey("YOUR_CONSUMER_KEY")
  .setOAuthConsumerSecret("YOUR_CONSUMER_SECRET")
  .setOAuthAccessToken("YOUR_ACCESS_TOKEN")
  .setOAuthAccessTokenSecret("YOUR_ACCESS_TOKEN_SECRET");


## Prerequisites

- Java Development Kit (JDK)
- Twitter Developer account
- Twitter4J library

## Usage

1. Compile the program using the following command:

      javac -cp .:twitter4j-core-4.0.7.jar API3.java
   

2. Run the program using the following command:

      java -cp .:twitter4j-core-4.0.7.jar API3
   

3. The program will start searching for tweets containing the keyword "کنکور" and write the results to the "result.txt" file.

## Built With

- [Twitter4J](http://twitter4j.org/en/index.html) - Java library for the Twitter API

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

## Acknowledgments

- The code in this program was inspired by various examples and tutorials available on the Twitter4J website.
