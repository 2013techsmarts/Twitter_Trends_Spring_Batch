package org.smarttechie.twitter.processor;

import java.util.ArrayList;
import java.util.List;

import org.smarttechie.twitter.model.TwitterTrend;
import org.springframework.batch.item.ItemProcessor;
import org.springframework.stereotype.Component;

import twitter4j.Trends;

/**
 * The TwitterTrendsProcessor implements ItemProcessor. This will convert the Trends object to our own domain model.
 * @author Siva Janapati
 * @version 1.0
 */
@Component("processor")
public class TwitterTrendsProcessor implements ItemProcessor<Trends, List<TwitterTrend>> {

	/**
	 * This method converts the Trends object to our own domain model.
	 */
	@Override
	public List<TwitterTrend> process(Trends trends) throws Exception {
		List<TwitterTrend> twitterTrends = null;
		TwitterTrend twitterTrend = null;
		if (trends != null && trends.getTrends() != null && trends.getTrends().length > 0) {
			twitterTrends = new ArrayList<TwitterTrend>();
			for (int index = 0; index < trends.getTrends().length; index++) {
				twitterTrend = new TwitterTrend();
				twitterTrend.setName(trends.getTrends()[index].getName());
				twitterTrend.setQuery(trends.getTrends()[index].getQuery());
				twitterTrend.setUrl(trends.getTrends()[index].getURL());
				twitterTrends.add(twitterTrend);
			}
		}
		return twitterTrends;
	}
}
