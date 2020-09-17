package Association;

public class Test {

	public static void main(String[] args) {
		Bank b1=new Bank("Ziraat Bankasý");
		Employee e1=new Employee("Arda");
		
		System.out.println(e1.getEmployeeName()+" "+b1.getBankName()+"nda çalýþýyor.");

	}

}
