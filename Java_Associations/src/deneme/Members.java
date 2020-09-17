package deneme;

import java.util.ArrayList;
import java.util.List;

public class Members {
	private String name;
	private int age;
	//private static List<Members>memberList;
	
	
	
	
	List<Members>memberList = new ArrayList<Members>();
	
	
	public Members() {
		
	}
	public Members(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public boolean ekle(Members a) {
		memberList.add(a);
		setMemberList(memberList);
		System.out.println("added");
		return true;
	}
	
	public String search(String name) {
		String str="";
		for(Members m : memberList) {
			if(m.getName().equals(name))
			{
				str+=m.toString();
				//str+=m.name+", "+m.age;
			}
			
		}
		return str;
	}
	public String searchByAge(int age) {
		String str="";
		for(Members m : memberList) {
			if(m.getAge()==age)
			{
				str+=m.toString();
				//str+=m.name+", "+m.age;
			}
			
		}
		return str;
	}
	
	public List<Members> getMemberList() {
		return memberList;
	}
	public void setMemberList(List<Members> memberList) {
		this.memberList = memberList;
	}



	@Override
	public String toString() {
		return "Members [name=" + name + ", age=" + age + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

	
	
	
}	
