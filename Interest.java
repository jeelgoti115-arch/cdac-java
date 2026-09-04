class Interest {
	public static void main(String[] args){
		int p = Integer.parseInt(args[0]);
		int r = Integer.parseInt(args[1]);
		int n = Integer.parseInt(args[2]);
		double i = p*r*n/100;
		System.out.println("interest = "+i);
	}
}

