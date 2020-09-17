package deneme;

import java.util.ArrayList;
import java.util.List;

import Aggregation.Student;
import CompositionCalisma.Book;

public class Test {

	public static void main(String[] args) {
		//Yarýn burda yaptýklarýný gym e entegre et.
		
	
		
		Members m=new Members();
		Members m1=new Members("Cihat",23);
		Members m2=new Members("Osman",22);
		
		
		
		
		
		m.ekle(m1);
		m.ekle(m2);
		System.out.println(m.getMemberList().toString());
		System.out.println(m.search( "Cihat"));
		System.out.println(m.searchByAge(22));
		
		
		/*
		mems.add(m1);
		mems.add(m2);
		System.out.println(m.getName());
		System.out.println(mems.toString());
		*/

		
		
		
		
		

		 
		
		
		
	
		
		
	
		
		
		
		
		

		
	
		
		

	}

}
