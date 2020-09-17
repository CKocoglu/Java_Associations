package Aggregation;

import java.util.List;

public class Institute {
	private String instituteName;
	private List<Department>departments;
	
	public Institute(String instituteName, List<Department> departments) {
		this.instituteName = instituteName;
		this.departments = departments;
	}
	
	public int getTotalStudentInInstitute() {
		int noOfStudents=0;
		List<Student> students;
		for(Department dept: departments)
		{
			students=dept.getStudents();
			for(Student s : students)
			{
				noOfStudents++;
			}
		}
		return noOfStudents;
	}
/*
	@Override
	public String toString() {
		return "Institute [instituteName=" + instituteName + ", departments=" + departments + "]";
	}
	*/
}
