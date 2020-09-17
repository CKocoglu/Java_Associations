package Aggregation;

import java.util.ArrayList;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		Student s1=new Student("Cihat ",1,"Design");
		Student s2=new Student("Osman ",2,"Design");
		Student s3=new Student("Zeynep ",1,"Coder");
		Student s4=new Student("Emir ",2,"Coder ");
		Student s5=new Student("Joker",2,"Coder");
		
		List<Student>designer_students=new ArrayList<Student>();
		designer_students.add(s1);
		designer_students.add(s2);
		
		List<Student>coder_students=new ArrayList<Student>();
		coder_students.add(s3);
		coder_students.add(s4);
		coder_students.add(s5);
		
		Department Design =new Department("Design",designer_students);
		Department Coder =new Department("Coder",coder_students);
		
		List<Department>departments=new ArrayList<Department>();
		departments.add(Design);
		departments.add(Coder);
		
		Institute institute = new Institute("BITS", departments); 
        
        System.out.print("Total students in institute: "); 
        System.out.print(institute.getTotalStudentInInstitute()); 
		
		//System.out.println(departments);
		


	}

}
