//Write a program to find the factorial of a given number.

public class Factorial {
	public static void main(String[] args) {
		int n = Integer.parseInt(args[0]);
		int fact = 1;
		for(int i = n;i>0;i--){
			fact = fact*i;
		}
		System.err.println(fact);
	}
}
