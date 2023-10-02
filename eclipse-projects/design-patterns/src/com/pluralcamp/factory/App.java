package com.pluralcamp.factory;

import java.util.List;

import com.pluralcamp.factory.entities.pages.Page;
import com.pluralcamp.factory.entities.websites.Website;
import com.pluralcamp.factory.entities.websites.WebsiteType;

public class App {

	public static void main(String[] args) {		
		
		factory(WebsiteType.BLOG);
		
		System.out.println("-----------------------------");
		
		factory(WebsiteType.SHOP);
	}
	
	private static void factory(WebsiteType siteType) {
		Website site = WebsiteFactory.getWebsite(siteType);
		List<Page> pages = site.getPages();
		
		for(Page page : pages) {
			System.out.println(page);
		}		
	}


}
