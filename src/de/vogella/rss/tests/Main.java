package de.vogella.rss.tests;

import de.vogella.rss.model.Feed;
import de.vogella.rss.model.FeedMessage;
import de.vogella.rss.read.RSSFeedParser;

public class Main {
	public static void main(String[] args) {
		RSSFeedParser parser = new RSSFeedParser(
				"https://zakupki.gov.ru/tinyurl/ea69bf287f432cbe9db0c00d07bd8b74bd5af0453a84b5e5d82d755717686553");
		Feed feed = parser.readFeed();
		System.out.println(feed);
		for (FeedMessage message : feed.getMessages()) {
			System.out.println(message);

		}
	}
}