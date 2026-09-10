import java.util.Scanner;
import java.util.Arrays;
public class MinMax {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of elements: ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter " + n + " numbers:");
		for (int i = 0; i < n; i++) {
				arr[i] = sc.nextInt();
		}
		int min = Arrays.stream(arr).min().getAsInt();
		int max = Arrays.stream(arr).max().getAsInt();
		System.out.println("Minimum: " + min);
		System.out.println("Maximum: " + max);
		sc.close();
	}
}
