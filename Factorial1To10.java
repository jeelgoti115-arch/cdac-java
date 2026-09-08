public class Factorial1To10 {
	public static void main(String[] args) {
			long factorial = 1;

			for (int i = 1; i <= 10; i++) {
					factorial *= i; 
					System.out.println(i + "! = " + factorial);
			}
	}
}