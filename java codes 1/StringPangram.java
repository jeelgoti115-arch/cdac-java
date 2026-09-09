// 32. Write a program to check if a given string is a pangram.
import java.util.*;
public class StringPangram {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a String to check pangram :");
		String str = sc.next().toLowerCase();
		
		System.out.println(str);

		if(str.length()<26){
			System.out.println("please enter valid string! \nminimum 26 letter");
			return;
		}

		int count = 0;
		for(char c='a';c<='z';c++){
			for(int i=0;i<str.length();i++){
				if(str.charAt(i)==c){
					count++;
					break;
				}
			}
		}
		if(count==26){
			System.out.println("pangram");
		}else{
			System.out.println("not pangram");
		}
	}
}
