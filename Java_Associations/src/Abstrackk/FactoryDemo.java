package Abstrackk;

public class FactoryDemo {

	public static void main(String[] args) {
		VehicleFactory vfactory=new VehicleFactory();
		Vehicle Car =vfactory.getVehicle("CAR");
		Vehicle Motor =vfactory.getVehicle("MOTORCYCLE");
		
		Car.move();
		Car.stop();
		
		Motor.move();
		Motor.stop();

	}

}
