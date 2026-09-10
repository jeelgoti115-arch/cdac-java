import java.util.Scanner;
public class SumDiag {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter matrix size (N for NxN): ");
		int n = sc.nextInt();
		int[][] matrix = new int[n][n];
		System.out.println("Enter elements of " + n + "x" + n + " matrix:");
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				matrix[i][j] = sc.nextInt();
			}
		}
		int primarySum = 0;
		for (int i = 0; i < n; i++) {
			primarySum += matrix[i][i];
			if (i != n - 1 - i) {
				totalDiagonalSum += matrix[i][n - 1 - i];
			}
		}
		System.out.println("Primary Diagonal Sum:   " + primarySum);
		sc.close();
	}
}