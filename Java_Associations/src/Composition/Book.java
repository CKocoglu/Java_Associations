package Composition;

import java.util.List;

public class Book {
	private String bookName;
	private int price;
	private final List<Page>pages;
	
	
	public Book(String bookName,int price,List<Page>pages) {
		this.bookName=bookName;
		this.price=price;
		this.pages=pages;
	}
	
	public int getPageNumber() {
		int pageNumber=0;
		
		
		for(Page p:pages )
		{
			pageNumber++;
		}
		return pageNumber;
	
	}
	public String getBookName() {
		return bookName;
	}
	public int getPrice() {
		return price;
	}
	public List<Page> getPages() {
		return pages;
	}

	@Override
	public String toString() {
		return "Book [bookName=" + bookName + ", price=" + price + ", pages=" + pages + "]";
	}
	

}
