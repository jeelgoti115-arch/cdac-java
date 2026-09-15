class Printer {
	public void printMessage() {
		System.out.println("Default message from Printer class.");
	}
}

class PrinterService {
	public void createPrinter() {
		Printer customPrinter = new Printer() {
			@Override
			public void printMessage() {
				System.out.println("Custom message printed via anonymous inner class!");
			}
		};
		customPrinter.printMessage();
	}
}

public class Que10 {
	public static void main(String[] args) {
		PrinterService service = new PrinterService();
		service.createPrinter();
	}
}