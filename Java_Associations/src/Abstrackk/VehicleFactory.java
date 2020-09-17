package Abstrackk;

public class VehicleFactory {

		public Vehicle getVehicle(String vehicleType) {
			if(vehicleType==null) {
				return null;
			}else if(vehicleType.equalsIgnoreCase("CAR")) {
				return new Car();
			}else if(vehicleType.equalsIgnoreCase("MOTORCYCLE")) {
				return new Motorcycle();
			}
			return null;
		}
	

}
