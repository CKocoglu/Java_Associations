package kalitim;

public class Person {
	private String name,surname;
	private int age;
	
	public Person() {
		this.name=" ";
		this.surname=" ";
		this.age=0;
	}
	public Person(String name,String surname,int age) {
		this.name=name;
		this.surname=surname;
		this.age=age;
	}
	
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name=name;
	}
	public String getSurname() {
		return this.surname;
	}
	public void setSurname(String surname) {
		this.surname=surname;
	}
	public int getAge() {
		return this.age;
	}
	public void setAge(int age) {
		this.age=age;
	}
	
	@Override
	public String toString() {
		return "Person [Name= "+this.name+" Surname= "+this.surname+" Age= "+this.age+ "]";
	}
	public void Walk() {
		System.out.println("Person is walking.");
	}
}
