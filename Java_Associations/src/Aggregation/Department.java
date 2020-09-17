package Aggregation;

import java.util.List;

public class Department {
	private String name;
	private List<Student> students;
	public Department(String name, List<Student> students) {
		super();
		this.name = name;
		this.students = students;
	}
	public List<Student> getStudents() {
		return students;
	}
	/*
	@Override
	public String toString() {
		return "Department [name=" + name + ", students=" + students + "]";
	}
*/
	
	
}	
