//Write a program to print the Fibonacci series up to a given number of terms.
class Fibonacci {
	public static void main(String[] args) {
		int n = Integer.parseInt(args[0]);
		int term1 = 0, term2 = 1;
		System.out.println("Fibonacci Series till " +n+ ":");
		for (int i = 1; i <= n; i++) {
				System.out.print(term1 + " ");
				int c = term1 + term2;
				term1 = term2;
				term2 = c;
		}
	}
}
