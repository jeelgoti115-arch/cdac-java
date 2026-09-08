import java.util.*;
public class Stringloop {
	public static void main(String[] args) { 
		Scanner sc = new Scanner(System.in); 
		System.out.println("Enter your String:"); 
		String str = sc.next(); 
		String reversed = "";
		for (int i = str.length() - 1; i >= 0; i--) { 
			reversed = reversed + str.charAt(i); 
		} 
		if (str.equals(reversed)) { 
			System.out.println("String is palindrome"); 
		}else{ 
			System.out.println("String is not palindrome"); 
		} 
	}
}
