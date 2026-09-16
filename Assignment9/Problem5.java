public class Problem5 {
	public static void main(String[] args) {
		try {
			try {
				int a=10;
				int b=0;

				int res=a/b;
				System.out.println("Result: " + res);
			}
			catch (ArithmeticException e){
				System.out.println(e);
			}

			try {
				int[] arr = {10, 20, 30, 40, 50};
				System.out.println("Element: " + arr[10]);
			}
			catch (ArrayIndexOutOfBoundsException e){
				System.out.println(e);
			}

		}
		catch (Exception e) {
			System.out.println("Some other exception occurred: " + e);
		}
finally {
			System.out.println("Program completed.");
		}
}

}
