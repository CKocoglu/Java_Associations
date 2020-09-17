package AggregrationCalisma;

import java.util.ArrayList;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		
		Student s1=new Student("Cihat",217);
		Student s2=new Student("Osman",2060);
		Student s3=new Student("Zeynep",1788);
		Student s4=new Student("Emir",150401);
		
		
		List<Student> students=new ArrayList<Student>();
		
		students.add(s1);
		students.add(s2);
		students.add(s3);
		students.add(s4);
		
		Department d1=new Department("Administrator",students);

		
		System.out.println("Number of Students in Administrator Department: "+d1.getStudentNumber());
		System.out.println(d1.toString());
		for(Student s : students) {
			System.out.println(s.getName()+" "+s.getId());
		}
	}

}	

