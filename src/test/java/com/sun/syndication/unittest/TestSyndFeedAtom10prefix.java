package com.sun.syndication.unittest;

import com.sun.syndication.feed.atom.Feed;
import com.sun.syndication.feed.atom.Link;

public class TestSyndFeedAtom10prefix extends FeedTest {

	public TestSyndFeedAtom10prefix() {
		super("atom_1.0_prefix.xml");
	}

    public void testTitle() throws Exception {
        Feed feed = (Feed) getWireFeed();
        assertEquals("1", feed.getId());
        assertEquals("xxx1", feed.getOtherLinks().get(0).getRel());
        assertEquals("xxx2", feed.getOtherLinks().get(1).getRel());
        assertEquals("xxx11", feed.getOtherLinks().get(0).getType());
        assertEquals("xxx22", feed.getOtherLinks().get(1).getType());
        assertEquals("http://foo.com/1", feed.getOtherLinks().get(0).getHref());
        assertEquals("http://foo.com/2", feed.getOtherLinks().get(1).getHref());
    }

}
