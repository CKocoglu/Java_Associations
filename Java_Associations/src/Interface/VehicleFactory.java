package Interface;

public class VehicleFactory {
	
	public IVehicle getVehicle(String VehicleType) {
		if(VehicleType==null) {
			return null;
		}else if(VehicleType.equalsIgnoreCase("BICYCLE")) {
			return new Bicycle();
		}else if(VehicleType.equalsIgnoreCase("CAR")) {
			return new Car();
		}else
			return null;
	}
}
