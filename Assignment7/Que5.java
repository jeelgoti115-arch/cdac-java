interface Vehicle {
	default void startEngine() {
		System.out.println(" Engine started");
	}
}

class Car implements Vehicle {
	@Override
	public void startEngine() {
		System.out.println("Engine Started. Car is now ready top roll");
	}
}

public class Que5 {
	public static void main(String[] args) {
		System.out.println("Overridden Vehicle Car Method.");
		Car c1 = new Car();
		c1.startEngine();
	}
}