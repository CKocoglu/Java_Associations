package AggregrationCalisma;

public class Student {
	private String name;
	private int id;
	
	public Student(String name,int id) {
		this.name=name;
		this.id=id;
	}
	
	public String getName() {
		return this.name;
	}
	public int getId() {
		return this.id;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", id=" + id + "]";
	}
	
}	
