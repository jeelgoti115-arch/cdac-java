import java.util.*;
public class SumofDigits {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your number");
		int n = sc.nextInt();
		int sum = 0;
		while(n>0){
			sum += n%10;
			n = n/10;
		}
		System.out.println("Sum is :"+sum);
	}
}