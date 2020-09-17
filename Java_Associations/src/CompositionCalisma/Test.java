package CompositionCalisma;

import java.util.ArrayList;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		Book b1=new Book("IT","Stephen King");
		Book b2=new Book("Pet Semetary","Stephen King");
		Book b3=new Book("Needful Things","Stephen King");
		
		List<Book> books=new ArrayList<Book>();
		books.add(b1);
		books.add(b2);
		books.add(b3);
		
		Library library=new Library(books);
		
		List<Book> bks=library.getBookNumber();
		
		for(Book bk : bks)
		{
		System.out.println("Title :"+bk.getTitle()+"  And Author :"+bk.getAuthor());
		}

	}

}
