package org.smarttechie.twitter.reader;

import org.springframework.batch.item.ItemReader;
import org.springframework.batch.item.NonTransientResourceException;
import org.springframework.batch.item.ParseException;
import org.springframework.batch.item.UnexpectedInputException;
import org.springframework.stereotype.Component;

import twitter4j.Trends;
import twitter4j.Twitter;
import twitter4j.TwitterFactory;
import twitter4j.auth.AccessToken;

/**
 * The TwitterTrendsReader implements ItemReader. This will make API call to twitter and pass the trends to processor.
 * @author Siva Janapati
 * @version 1.0
 */

@Component("reader")
public class TwitterTrendsReader implements ItemReader<Trends> {

	/**
	 * This methods make API call to twitter and pass the trends to processor
	 */
	@Override
	public Trends read() throws Exception, UnexpectedInputException,
	ParseException, NonTransientResourceException {
		TwitterFactory factory = new TwitterFactory();
	    AccessToken accessToken = new AccessToken("1694316384-809l6aOtWac6RxDPgi7Fs49cKECGSH4z0HGQewK", "lqGGolTLIwIQMEu5tLwFS7YLI2qXeI0mRopA847H7g");
	    Twitter twitter = factory.getInstance();
	    twitter.setOAuthConsumer("zLMchsoH1JHO2oiDj7BvgQ", "dwHc79K5j5GOh7I0lPRaqaR6UhYinuPoqDX1F3eDPE");
	    twitter.setOAuthAccessToken(accessToken);
		Trends trends = twitter.getPlaceTrends(1);
		return trends;
	}
}
