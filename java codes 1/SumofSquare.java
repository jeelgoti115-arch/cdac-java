// Write a program to calculate the sum of the squares of numbers from 1 to 10.

public class SumofSquare {
	public static void main(String[] args) {
		int n = Integer.parseInt(args[0]);
		int sum = 0;
		for(int i=1;i<=n;i++){
			sum += Math.pow(i,2);
		}
		System.err.println(sum);
	}
}
