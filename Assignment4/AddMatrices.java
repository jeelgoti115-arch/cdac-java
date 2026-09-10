import java.util.Scanner;
public class AddMatrices {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of rows: ");
		int rows = sc.nextInt();
		System.out.print("Enter number of columns: ");
		int cols = sc.nextInt();
		int[][] first = new int[rows][cols];
		int[][] second = new int[rows][cols];
		int[][] sum = new int[rows][cols];
		System.out.println("Enter elements of First Matrix:");
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
					first[i][j] = sc.nextInt();
			}
		}
		System.out.println("Enter elements of Second Matrix:");
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
					second[i][j] = sc.nextInt();
			}
		}
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
					sum[i][j] = first[i][j] + second[i][j];
			}
		}
		System.out.println("Sum of the two matrices:");
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
					System.out.print(sum[i][j] + "\t");
			}
			System.out.println();
		}
		sc.close();
	}
}