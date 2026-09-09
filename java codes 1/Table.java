//Write a program to print the multiplication table of a given number.

public class Table {
	public static void main(String[] args) {
		int n = Integer.parseInt(args[0]);
		for(int i=1;i<11;i++){
			int ans = n*i;
			System.out.println(+n+" * "+i+" = "+ans);
		}
	}
}
