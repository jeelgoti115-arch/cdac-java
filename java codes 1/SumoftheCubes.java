public class SumoftheCubes {
	public static void main(String[] args) {
		int n = 10;
		int sum = 0;
		for(int i=1;i<11;i++){
			sum += Math.pow(i,3);
		}
		System.out.println(sum);
	}
}
