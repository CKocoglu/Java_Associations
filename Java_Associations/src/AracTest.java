import java.util.Scanner;

public class AracTest {

	public static void main(String[] args) {
		Arac a1=new Arac("Mavi", "BMW", 200);

		Scanner scan=new Scanner(System.in);
		int secim;
	   
		do {
			System.out.println();
			System.out.println("1-Aracin özelliklerini göster.");
			System.out.println("2-Motoru çalýþtýr.");
			System.out.println("3-Gaza bas.");
			System.out.println("4-Aracin hizini göster.");
			System.out.println("5-Frene bas ve aracý durdur.");
			System.out.println("Araci kapatmak için '0' a basiniz.");
			secim=scan.nextInt();
		switch(secim) {
		case 1:
			if(secim==1) {
				System.out.println(a1.toString());
			}
		    break;
		case 2:
			if(secim==2) {
				a1.motoruCalistir();
			}
			break;
		case 3:
			if(secim==3) {
				a1.ilerle();
			}
			break;
		case 4:
			if(secim==4) {
				a1.hiz();
			}
			break;
		case 5:
			if(secim==5) {
				a1.fren();
			}
		}
	
		}while(secim!=0);
		}
	}


