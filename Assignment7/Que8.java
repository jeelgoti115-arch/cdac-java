interface Greetin {
	void sayHello();
}
class GreetingService {
	public void generateGreeting() {
		Greetin greeting = new Greetin() {
			@Override
			public void sayHello() {
				System.out.println("Hello! Have a wonderful day ahead.(This Message is from Anonymous Class.)");
			}
		};
		greeting.sayHello();
	}
}

public class Que8 {
	public static void main(String[] args) {
		GreetingService service = new GreetingService();
		service.generateGreeting();
	}
}