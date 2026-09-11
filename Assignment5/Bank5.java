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
  public void deposit(int amt){
    balance = balance + amt;
    System.out.println("amount deposited in account is: "+ amt+ " current balance is: "+balance);
  }
  public void withdraw(int amt){
    balance = balance - amt;
    System.out.println("amount withdrawn is: "+amt+ " current balance is: "+balance);
  }
  public String display() {
    return "account number: "+ accno+" has an account type : "+accType+ " has current balance of: "+balance;
  }
}

public class Bank5 {
	public static void main(String[] args) {
    BankAccount b1 = new BankAccount(1002, "SavingAcct", 10000.00);
    b1.deposit(5000);
    System.out.println(b1.display());
    b1.withdraw(2500);
    System.out.println(b1.display());
 } 
}