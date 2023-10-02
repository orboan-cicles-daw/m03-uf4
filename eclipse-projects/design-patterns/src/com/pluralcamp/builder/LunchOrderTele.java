package com.pluralcamp.builder;

public class LunchOrderTele {
	
	private String bread;
	private String condiments;
	private String dressing;
	private String meat;
	
	public LunchOrderTele() {
		super();
	}	
	
	public LunchOrderTele(
			String bread, 
			String condiments,
			String dressing,
			String meat
			) {
		this.bread = bread;
		this.condiments = condiments;
		this.dressing = dressing;
		this.meat = meat;
	}
	
	public LunchOrderTele(
			String bread, 
			String dressing,
			String meat
			) {
		this.bread = bread;		
		this.dressing = dressing;
		this.meat = meat;
	}
	
//	public LunchOrderTele(
//			String bread,
//			String condiments,
//			String dressing
//			) {
//		this.bread = bread;
//		this.condiments = condiments;
//		this.dressing = dressing;
//	}
	
	public LunchOrderTele(
			String bread, 
			String meat
			) {
		this.bread = bread;
		this.meat = meat;
	}
	
	public LunchOrderTele(
			String meat
			) {
		this.meat = meat;
	}
	
	public String getBread() {
		return bread;
	}
	
	public String getCondiments() {
		return condiments;
	}

	public String getDressing() {
		return dressing;
	}

	public String getMeat() {
		return meat;
	}
	
	@Override
	public String toString() {
		String clase = this.getClass().getSimpleName();
		return clase + ": " +
				"bread = " + this.getBread() + ", " + 
				"condiments = " + this.getCondiments() + ", " +
				"dressing = " + this.getDressing() + ", " +
				"meat = " + this.getMeat();
	}
}
