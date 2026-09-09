// Write a program to check if a given string is a palindrome.
import java.util.*;
public class PalindromeString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your String :");
		String str = sc.next();
		// System.out.println(str);

        String reversed = new StringBuilder(str).reverse().toString();

        System.out.println(reversed);

        if (reversed.equals(str)) {
            System.out.println("String is palindrome");
        } else {
            System.out.println("String is not palindrome");
        }
	}
}
