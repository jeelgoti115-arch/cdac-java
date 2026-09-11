class BankAccount {
	int accno;
	String accType;
	double balance;
	static double interestRate;

	static {
		interestRate = 7.5;
	}
	BankAccount(int accno, String accType, double balance) { 
		this.accno = accno;
		this.accType = accType; 
		this.balance = balance; 
	}
	public static double calculateInterest(double bal, double rate) {
		return (bal * rate) / 100.0;
	}
	public void applyInterest() {
		double interest = calculateInterest(balance, interestRate);
		balance = balance + interest;
		System.out.println("interest added: " + interest + " updated balance is: " + balance);
	}
	public void deposit(int amt) {
		balance = balance + amt;
		System.out.println("amount deposited in account is: " + amt + " current balance is: " + balance);
	}
	public void withdraw(int amt) {
		balance = balance - amt;
		System.out.println("amount withdrawn is: " + amt + " current balance is: " + balance);
	}
	public void displayAccountDetails() {
		double interest = calculateInterest(balance, interestRate);
		System.out.println("account number: " + accno + " has an account type: " + accType + " has current balance of: " + balance + " interest earned: " + interest);
	}
	public String display() {
		return "account number: " + accno + " has an account type : " + accType + " has current balance of: " + balance;
	}
}

public class Bank6 {
	public static void main(String[] args) {
		BankAccount b1 = new BankAccount(1002, "SavingAcct", 10000.00);
		b1.deposit(5000);
		b1.displayAccountDetails();
		b1.applyInterest();
		b1.withdraw(2500);
		b1.displayAccountDetails();
	} 
}
