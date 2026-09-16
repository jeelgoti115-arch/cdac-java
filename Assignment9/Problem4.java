import java.util.Scanner;
public class Problem4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		try {
			int a = Integer.parseInt(s);
			System.out.println("Converted Integer is :"+a);
		} catch (NumberFormatException e) {
			System.out.println(e);
		}finally{
			System.out.println("Operation Complete");
		}
	}
}
