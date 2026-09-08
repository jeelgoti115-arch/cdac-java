public class SumofOdd1to50 {
	public static void main(String[] args) {
		int n = 50;
		int sum = 0;
		for(int i = 1;i<51;i++){
			if(i%2!=0){
				sum += i;
			}
		}
		System.out.println(sum);
	}
}
