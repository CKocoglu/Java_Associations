package Interface;

public class Car implements IVehicle {
	public int speed;
	public int gear;
	
	
	public Car() {
		super();
	}

	@Override
	public void changeGear(int newGear) {
		gear=newGear;

	}

	@Override
	public void increaseSpeed(int incSpeed) {
		speed+=incSpeed;

	}

	@Override
	public void decreaseSpeed(int decSpeed) {
		speed-=decSpeed;
	}
	@Override
	public void printStates() {
		System.out.println("Car:"+"Speed: "+speed+" Gear: " +gear);
	}

}
