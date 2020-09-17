package kalitim;

public class Student extends Person {
	private int grade;
	
	public Student() {
		this.grade=1;
	}
	public Student(String name,String surname,int age,int grade) {
		super(name,surname,age);
		this.grade=grade;
	}
	public int getGrade() {
		return this.grade;
	}
	public void setGrade(int grade) {
		this.grade=grade;
	}
	
	@Override
	public String toString() {
		return  "Student Informations= "+super.toString()+" Grade= "+this.grade;
	}
	@Override
	public void Walk() {
		System.out.println("Student is walking.");
	}
}
