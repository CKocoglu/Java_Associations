package AggregrationCalisma;

import java.util.List;

public class Department {
	private String name;
	private List<Student> students;
	
	public Department(String name,List<Student> students) {
		this.name=name;
		this.students=students;
	}
	
	public List<Student> getStudents(){
		return this.students;
	}
	public String getName() {
		return this.name;
	}
	
	public int getStudentNumber() {
		int numberOfStudents=0;
		
		for(Student s : students) {
			numberOfStudents++;
		}
		return numberOfStudents;
	}
	@Override
	public String toString() {
		return "Department: "+this.name+" "+students.toString();
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setStudents(List<Student> students) {
		this.students = students;
	}
}
