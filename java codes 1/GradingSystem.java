class GradingSystem{
	public static void main(String[] args) {
		int avg = Integer.parseInt(args[0]);

		if (avg >= 90) {
			System.out.println("A");
		}else if(avg >= 80){
			System.out.println("B");
		}else if(avg >= 70){
			System.out.println("C");
		}else if(avg >= 60){
			System.out.println("D");
		}else{
			System.out.println("\n Fail! Better luck next time ");
		}
	}
}