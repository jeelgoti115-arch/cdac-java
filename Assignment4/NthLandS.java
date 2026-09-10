import java.util.Scanner;
import java.util.Arrays;

public class NthLandS {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of elements: ");
		int total = sc.nextInt();
		int[] arr = new int[total];
		System.out.println("Enter " + total + " elements:");
		for (int i = 0; i < total; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.print("Enter value of n: ");
		int n = sc.nextInt();
		int[] distinctSorted = Arrays.stream(arr).distinct().sorted().toArray();
		if (n <= 0 || n > distinctSorted.length) {
			System.out.println("Invalid input: n is out of range! Total unique elements: " + distinctSorted.length);
		} else {
			int nthSmallest = distinctSorted[n - 1];
			int nthLargest = distinctSorted[distinctSorted.length - n];
			System.out.println(n + "th Smallest: " + nthSmallest);
			System.out.println(n + "th Largest:  " + nthLargest);
		}
		sc.close();
	}
}