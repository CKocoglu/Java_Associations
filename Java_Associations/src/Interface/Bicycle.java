package Interface;

public class Bicycle implements IVehicle {
	public int speed;
	public int gear;
	
	
	public Bicycle() {
		super();
	}
	@Override
	public void changeGear(int newGear) {
		gear=newGear;
	}
	@Override
	public void increaseSpeed(int incSpeed) {
		speed=speed+incSpeed;
	}
	@Override
	public void decreaseSpeed(int decSpeed) {
		speed=speed-decSpeed;
	}
	@Override
	public void printStates() {
		System.out.println("Bicycle:"+"Speed: "+speed+" Gear: " +gear);
	}
}
