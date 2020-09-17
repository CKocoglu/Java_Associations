
public class Arac {
	private String renk;
	private String marka;
	private int hiz;
	
	public Arac(String renk, String marka, int hiz) {
		this.renk = renk;
		this.marka = marka;
		this.hiz = hiz;
	}

	@Override
	public String toString() {
		return "Arac [renk=" + renk + ", marka=" + marka + ", hiz=" + hiz + "]";
	}
	
	public void motoruCalistir() {
		System.out.println("Motor çalýþmaya baþladý...");
	}
	public void ilerle() {
		System.out.println("Arac ilerliyor.");
	}
	public void hiz() {
		this.hiz+=10;
		System.out.println("Aracin hizi "+this.hiz);
	}
	public void fren() {
		System.out.println("Frene basildi arac durdu.");
	}

	public String getRenk() {
		return renk;
	}

	public void setRenk(String renk) {
		this.renk = renk;
	}

	public String getMarka() {
		return marka;
	}

	public void setMarka(String marka) {
		this.marka = marka;
	}

	public int getHiz() {
		return hiz;
	}

	public void setHiz(int hiz) {
		this.hiz = hiz;
	}
	
	
	
}
