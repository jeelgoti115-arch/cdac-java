class Compound_Interest {
	public static void main(String[] args){
		int p = Integer.parseInt(args[0]);
		int r = Integer.parseInt(args[1]);
		int n = Integer.parseInt(args[2]);
		int t = Integer.parseInt(args[3]);
		double i = Math.pow(p*(1+r/n),(n*t));
		System.out.println("Compound interest Amount = "+i);
	}
}

