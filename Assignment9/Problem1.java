import java.util.Scanner;
public class Problem1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter Number 1 :");
		int a = sc.nextInt();

		System.out.print("Enter Number 2 :");
		int b = sc.nextInt();

		try{
			int div = a/b;
			System.out.println("Division of two number is :"+div);
		}catch(ArithmeticException e){
			System.out.println("Number can not be divisble by zero"+e);
		}finally{
			System.out.println("Operation is complete.");
		}
	}	
}