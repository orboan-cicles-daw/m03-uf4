package com.pluralcamp.factory;

import com.pluralcamp.factory.entities.websites.Blog;
import com.pluralcamp.factory.entities.websites.Shop;
import com.pluralcamp.factory.entities.websites.Website;
import com.pluralcamp.factory.entities.websites.WebsiteType;

public class WebsiteFactory {

	private WebsiteFactory() {
	}

	public static Website getWebsite(WebsiteType siteType) {
		switch (siteType) {
		case BLOG: {
			Blog b = new Blog();
			b.setTitle("Java in practice");
			return b;
		}
		case SHOP: {
			return new Shop();
		}
		default: {
			return null;
		}
		}
	}

}
