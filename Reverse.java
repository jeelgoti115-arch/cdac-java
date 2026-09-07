import java.util.*;
public class Reverse {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number to rev: ");
		int n = sc.nextInt();
		int x = n;
		int rev = 0;
		while(n>0){
			rev = rev*10 + n%10;
			n = n/10;
		}
		System.out.println("Reverse of the "+x+" is :"+rev);
	}
}
