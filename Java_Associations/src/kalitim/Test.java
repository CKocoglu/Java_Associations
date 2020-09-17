package kalitim;

public class Test {

	public static void main(String[] args) {
		Person p1=new Person("Osman","Doðan",23);
		Student s1=new Student();
		System.out.println(s1);
		
		
		Student s2=new Student("Cihat","Kocoglu",23,4);
		System.out.println(s2);
		
		p1.Walk();
		s2.Walk();
	}

}
