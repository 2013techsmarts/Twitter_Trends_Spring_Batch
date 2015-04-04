package org.smarttechie.twitter.writer;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.smarttechie.twitter.model.TwitterTrend;
import org.springframework.batch.item.ItemWriter;
import org.springframework.stereotype.Component;


/**
 * TwitterTrendsWriter {@link ItemWriter} which logs the trends information to console.
 * @author Siva Janapati
 * @version 1.0
 */
@Component("writer")
public class TwitterTrendsWriter implements ItemWriter<List<TwitterTrend>> {

	private static final Log log = LogFactory.getLog(TwitterTrendsWriter.class);

	@Override
	public void write(List<? extends List<TwitterTrend>> items)
			throws Exception {
		if (items != null && !items.isEmpty()) {
			List<TwitterTrend> trends = items.get(0);
			if (trends != null && !trends.isEmpty()) {
				for (TwitterTrend trend : trends) {
					log.info("The name : " + trend.getName());
					log.info("The query : " + trend.getQuery());
					log.info("The url : " + trend.getUrl());
				}
			}
		}
	}
}
