package net.accenture.bootcamp.encap;

public class Book {
	private int pages;
	private String name;
	private String type;
	
	
	public int getPages() {
		return pages;
	}
	public void setPages(int pages) {//we allow to modify in condition
		if(pages > 0 & pages < 1000)
		    this.pages = pages;
	}
	public String getName() {
		return name;
	}
	//we don't want somebody to change the name of our book
	//public void setName(String name) {
	//	this.name = name;
	//}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}

	
	

}
