class GradingSystem{
	public static void main(String[] args) {
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		int c = Integer.parseInt(args[2]);

		int sum = (a + b +c);
		System.out.println("Sum is:" +sum);
		int avg = (a + b + c)/3 ;
		System.out.println("avg is :"+avg);

		if(a > 100 || a < 0 || b > 100 || b < 0 ||  c > 100 || c < 0)
			System.out.println("enter valid marks!");

		if (a < 33 || b < 33 || c < 33)
			System.out.println("\n Fail! Better luck next time ");

		if (avg > 90) {
			System.out.println("A");
		}else if(avg > 80){
			System.out.println("B");
		}else if(avg > 70){
			System.out.println("C");
		}else if(avg > 60){
			System.out.println("D");
		}else{
			System.out.println("\n Fail! Better luck next time ");
		}
	}
}