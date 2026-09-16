import java.util.Scanner;
public class Problem2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[5];
		for(int i=0;i<5;i++){
			arr[i] = sc.nextInt();
		}
		System.out.println("enter the index you want ");
		int j = sc.nextInt();
		try {
			System.out.println("Element at index "+ j +" you asked: "+ arr[j]);
		} catch (ArrayIndexOutOfBoundsException  e) {
			System.out.println("Access of element out of range "+ e);
		}finally{
			System.out.println("Operation Complete");
		}
	}	
}