import java.util.Scanner;
import java.util.Arrays;
public class SumandAvgArr {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of elements: ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter " + n + " numbers:");
		for (int i = 0; i < n; i++) {
				arr[i] = sc.nextInt();
		}
		int sum = Arrays.stream(arr).sum();
		double avg = Arrays.stream(arr).average().orElse(0.0);
		System.out.println("Sum: " + sum);
		System.out.println("Average: " + avg);
		sc.close();
	}
}
