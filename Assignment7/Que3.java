abstract class Appliance {
	protected String brand;
	protected int power;
	Appliance(String brand, int power) {
		this.brand = brand;
		this.power = power;
	}
	abstract void turnOn();
	}
class WashingMachine extends Appliance {
	WashingMachine(String brand, int power) {
		super(brand, power);
	}
	void turnOn() {
		System.out.println("Brand : " + brand);
		System.out.println("Power : " + power);
	}
}
class Refrigerator extends Appliance {
	Refrigerator(String brand, int power) {
		super(brand, power);
	}
	void turnOn() {
		System.out.println("Brand : " + brand);
		System.out.println("Power : " + power);
	}
}

class Microwave extends Appliance {
	Microwave(String brand, int power) {
		super(brand, power);
	}
	void turnOn() {
		System.out.println("Brand : " + brand);
		System.out.println("Power : " + power);
	}
}

public class Que3 {
	public static void main(String[] args) {
		Microwave m1 = new Microwave("Samsung", 24);
		m1.turnOn();
		System.out.println();
		WashingMachine w1 = new WashingMachine("Godrej", 19);
		w1.turnOn();
		System.out.println();
		Refrigerator r1 = new Refrigerator("LG", 50);
		r1.turnOn();
	}
}