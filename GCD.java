//Write a program to find the greatest common divisor (GCD) of two numbers.

import java.util.*;
public class GCD {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the Number1: ");
		int num1 = scanner.nextInt();
		System.out.print("Enter the Number2: ");
		int num2 = scanner.nextInt();

		int result = gcd(num1,num2);
		System.out.println("GCD of " +num1+ " and "+num2+ " is :" +result);
	}
	static int gcd(int num1, int num2){
		if(num1==0) return num2;
		if(num2==0) return num1;
		if(num1==num2) return num1;
		if(num2>num1) return gcd(num1, Math.abs(num1-num2));
		return gcd(Math.abs(num1-num2),num2);
	}
}