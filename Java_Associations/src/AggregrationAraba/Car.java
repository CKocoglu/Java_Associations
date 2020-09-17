package AggregrationAraba;

public class Car {
	private final Engine engine; //Composition
	//private Engine engine;       //Aggregration
	
	public Car(Engine engine) {
		this.engine=engine;
	}
	
	public void move() {
		if(engine!=null)
		{
			engine.work();
			System.out.println("Car is moving.");
		}		
	}
}
