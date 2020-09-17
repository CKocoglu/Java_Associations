package Interface;

public class VehicleFactoryDemo {

	public static void main(String[] args) {
		VehicleFactory vehicleFactory =new VehicleFactory();
		
		IVehicle Bicycle =new VehicleFactory().getVehicle("BICYCLE");
		
		Bicycle.increaseSpeed(50);
		Bicycle.changeGear(50);
		Bicycle.printStates();
		IVehicle Car=new VehicleFactory().getVehicle("Car");
		
		Car.increaseSpeed(100);
		Car.changeGear(200);
		Car.printStates();

	}

}
