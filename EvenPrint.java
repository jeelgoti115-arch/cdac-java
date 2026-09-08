// Write a program to print the even numbers between 1 and 100.
public class EvenPrint {
	public static void main(String[] args) {
		int n = 100;
		for(int i = 1;i<101;i++){
			if(i%2==0){
				System.out.println(i);
			}
		}
	}
}
