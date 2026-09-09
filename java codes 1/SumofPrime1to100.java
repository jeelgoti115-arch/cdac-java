// Write a program to find the sum of all prime numbers between 1 and 100.

public class SumofPrime1to100 {
	public static void main(String[] args) {
		int sum = 0;
		for (int i=2;i<=100;i++) {
			if (isPrime(i)) {
				sum += i;
			}
		}
		System.out.println("Sum of prime numbers between 1 and 100 is: " + sum);
	}
	public static boolean isPrime(int n) {
		if (n < 2) {
			return false;
		}
		for (int i = 2; i * i <= n; i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}
}