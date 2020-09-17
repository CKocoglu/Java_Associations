package AbstractOrnek;

public abstract class Tasit {
	private String color;
	
	public Tasit() {
		
	}
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	
	public abstract void ilerle();
	
	public abstract void dur();
}	
