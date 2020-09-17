package Composition;

public class Page {
	private int pageNumber;
	private String pageColor;
	
	public Page(int pageNumber) {
		this.pageNumber=pageNumber;
		this.pageColor="red";
	}
	public int getPageNumber() {
		return pageNumber;
	}
	public String getPageColor() {
		return pageColor;
	}
	@Override
	public String toString() {
		return "Page [pageNumber=" + pageNumber + ", pageColor=" + pageColor + "]";
	}
	
}
