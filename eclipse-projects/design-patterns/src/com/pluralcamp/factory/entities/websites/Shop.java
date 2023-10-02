package com.pluralcamp.factory.entities.websites;

import com.pluralcamp.factory.entities.pages.*;

public class Shop extends Website {
	
	@Override
	public void createWebsite() {
		pages.add(new CartPage());
		pages.add(new ContactPage());
		pages.add(new SearchPage());
		pages.add(new ItemPage());
	}
}
