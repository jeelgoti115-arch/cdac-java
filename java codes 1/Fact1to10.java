// 33. Write a program to find the factorial of numbers from 1 to 10.

public class Fact1to10 {
	public static void main(String[] args) {
		long factorial = 1;
		for (int i = 1; i <= 10; i++) {
			factorial *= i;
			System.out.println("Factorial of " + i + " = " + factorial);
		}
	}
}