
public class recursion {
	public static int faktoriyel(int number) {
		
		if(number==1 || number==0)
		{
			return 1;
		}

		return faktoriyel(number-1)*number ;
	}
	public static int sayininToplami(int number) {
		if (number==0)
		{
			return 0;
		}
		return sayininToplami(number-1)+number;
		
		
	}

	public static void main(String[] args) {
		System.out.println(faktoriyel(6));
		System.out.println(sayininToplami(10));

	}

}
