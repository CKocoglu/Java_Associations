package d2;

import java.util.List;

public class Member {
	private String name;
	private List<Member>uyeler;
	
	
	
	
	
	public Member() {
		
	}

	public Member(String name) {
		this.name = name;
		
	}
	
	public void ekle(String name) {
		Member m3 = new Member(name);
		//uyeler.add(m3);
		System.out.println("eklendi.");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	@Override
	public String toString() {
		return "Member [name=" + name + ", uyeler=" + uyeler + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Member> getUyeler() {
		return uyeler;
	}
	public void setUyeler(List<Member> uyeler) {
		this.uyeler = uyeler;
	}
	
	
}
