import java.util.Scanner;
public class SumFirstSecondHalf {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of elements: ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter " + n + " elements:");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		int mid = n / 2;
		int firstHalfSum = 0;
		int secondHalfSum = 0;
		for (int i = 0; i < mid; i++) {
			firstHalfSum += arr[i];
		}
		int secondStart = (n % 2 == 0) ? mid : mid + 1;
		for (int i = secondStart; i < n; i++) {
			secondHalfSum += arr[i];
		}
		System.out.println("Sum of first half: " + firstHalfSum);
		System.out.println("Sum of second half: " + secondHalfSum);
		if (n % 2 != 0) {
			System.out.println("Middle element (excluded from both): " + arr[mid]);
		}
		sc.close();
	}
}