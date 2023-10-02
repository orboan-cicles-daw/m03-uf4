package com.pluralcamp.factory.entities.websites;

import com.pluralcamp.factory.entities.pages.*;

public class Blog extends Website {
	
	private String title;
	
	public Blog() {
		super();
	}
	
	
	
	public String getTitle() {
		return title;
	}



	public void setTitle(String title) {
		this.title = title;
	}



	@Override
	public void createWebsite() {
		pages.add(new PostPage());
		pages.add(new ContactPage());
		pages.add(new SearchPage());
		pages.add(new CommentPage());
		pages.add(new AboutPage());
	}
}
