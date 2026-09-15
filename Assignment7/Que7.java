interface Payment {
	void pay(double amount);
}

class CreditCardPayment implements Payment {
	private String cardNumber;
	public CreditCardPayment(String cardNumber) {
		this.cardNumber = cardNumber;
	}
	@Override
	public void pay(double amount) {
		System.out.println("Paid $" + amount + " using Credit Card (Ending with " + cardNumber.substring(cardNumber.length() - 4) + ").");
	}
}

class PaypalPayment implements Payment {
	private String email;
	public PaypalPayment(String email) {
		this.email = email;
	}
	@Override
	public void pay(double amount) {
		System.out.println("Paid $" + amount + " via PayPal account: " + email);
	}
}

class PaymentProcessor {
	public void processPayment(Payment paymentMethod, double amount) {
		paymentMethod.pay(amount);
	}
}

public class Que7 {
	public static void main(String[] args) {
		PaymentProcessor processor = new PaymentProcessor();

		Payment creditCard = new CreditCardPayment("1234567890123456");
		Payment payPal = new PaypalPayment("user@example.com");

		processor.processPayment(creditCard, 249.99);
		processor.processPayment(payPal, 89.50);
	}
}