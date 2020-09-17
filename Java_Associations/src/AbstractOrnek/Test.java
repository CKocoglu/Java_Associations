package AbstractOrnek;

public class Test {

	public static void main(String[] args) {
		Tasit a1=new Araba();
		Tasit m1=new Motor();
		a1.setColor("Red");
		m1.setColor("Blue");
		
		
		System.out.println(a1.getColor());
		System.out.println(m1.getColor());
		a1.ilerle();
		m1.ilerle();
		m1.dur();
		a1.dur();
		
	
		

	}

}
