class NumberCheck{
	public static void main(String[] args){
		int n = Integer.parseInt(args[0]);

		if(n>0){
		System.out.println("number is positive");
		}else if(n<0){
			System.out.println("number is negative");
		}else{
			System.out.println("number is zero");
		}
	}
}