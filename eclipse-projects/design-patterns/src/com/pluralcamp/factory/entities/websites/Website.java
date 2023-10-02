package com.pluralcamp.factory.entities.websites;

import java.util.ArrayList;
import java.util.List;

import com.pluralcamp.factory.entities.pages.Page;

public abstract class Website {
	//Collections
	protected List<Page> pages = new ArrayList<>();
	
	public Website() {
		this.createWebsite();
	}
	
	public List<Page> getPages() {
		return pages;
	}



	public abstract void createWebsite();
}
