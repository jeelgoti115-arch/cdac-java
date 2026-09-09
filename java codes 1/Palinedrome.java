//Write a program to check if a given number is a palindrome.

public class Palinedrome {
	public static void main(String[] args) {
		int n = Integer.parseInt(args[0]);
		int x = n;
		int rev = 0;
		while(n>0){
			rev = rev*10 + n%10;
			n = n/10;
		}
		if(rev==x){
			System.out.println(+x+" is palinedrome");
		}else{
			System.out.println(+x+" is not palinedrome");
		}
	}
}
