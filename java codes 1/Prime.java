// Write a program to check if a given number is prime.

public class Prime {
	public static void main(String[] args) {
		int n = Integer.parseInt(args[0]);
		int Count = 0;
		for(int i = 1;i<=n;i++){
			if(n%i==0){
				Count += 1;
			}
		}
		if(Count==2){
			System.out.println(+n+" is prime number");
		}else{
			System.out.println(+n+"is not prime number");
		}
	}
}
