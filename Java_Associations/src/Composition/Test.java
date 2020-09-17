package Composition;

import java.util.ArrayList;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		Page p1=new Page(1);
		Page p2=new Page(2);
		Page p3=new Page(3);
		Page p4=new Page(4);
		Page p5=new Page(5);
		Page p6=new Page(6);
		
		List<Page>pages=new ArrayList<Page>();
		pages.add(p1);
		pages.add(p2);
		pages.add(p3);
		pages.add(p4);
		pages.add(p5);
		pages.add(p6);
		
		Book books=new Book("It",200,pages);
		
		System.out.println(books.getPageNumber());
		System.out.println(books.toString());
		int i=1;
		for(Page p: pages) {
			System.out.println(i+"."+p.toString());
			i++;
		}
		
	}

}
