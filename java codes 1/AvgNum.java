import java.util.*;
public class AvgNum {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the count of number :");
		int n = scanner.nextInt();
		double sum = 0;
		System.out.println("Enter " +n+ " numbers:");
		for (int i=0;i<n;i++) {
				sum += scanner.nextDouble();
		}
		double average = sum / n;
		System.out.println("Average: " + average);
		scanner.close();
}
}