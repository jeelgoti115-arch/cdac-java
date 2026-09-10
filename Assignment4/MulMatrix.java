import java.util.Scanner;
public class MulMatrix {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter rows of Matrix A: ");
		int r1 = sc.nextInt();
		System.out.print("Enter columns of Matrix A: ");
		int c1 = sc.nextInt();
		System.out.print("Enter rows of Matrix B: ");
		int r2 = sc.nextInt();
		System.out.print("Enter column of Matrix B: ");
		int c2 = sc.nextInt();
		if (c1 != r2) {
			System.out.println("Multiplication not possible: Columns of Matrix A must equal Rows of Matrix B.");
			sc.close();
			return;
		}
		int[][] a = new int[r1][c1];
		int[][] b = new int[r2][c2];
		int[][] prod = new int[r1][c2];
		System.out.println("Enter elements of Matrix A:");
		for (int i = 0; i < r1; i++) {
			for (int j = 0; j < c1; j++) {
					a[i][j] = sc.nextInt();
			}
		}
		System.out.println("Enter elements of Matrix B:");
		for (int i = 0; i < r2; i++) {
			for (int j = 0; j < c2; j++) {
					b[i][j] = sc.nextInt();
			}
		}
		for (int i = 0; i < r1; i++) {
			for (int j = 0; j < c2; j++) {
				for (int k = 0; k < c1; k++) { // c1 == r2
					prod[i][j] += a[i][k] * b[k][j];
				}
			}
		}
		System.out.println("Product Matrix (" + r1 + "x" + c2 + "):");
		for (int i = 0; i < r1; i++) {
			for (int j = 0; j < c2; j++) {
				System.out.print(prod[i][j] + "\t");
			}
			System.out.println();
		}
		sc.close();
	}
}