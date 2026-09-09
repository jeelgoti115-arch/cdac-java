class Leap{
	public static void main(String[] args){
		int n = Integer.parseInt(args[0]);

		if(n%4 == 0){
			if(n%100 == 0){
				if(n%400 == 0){
					System.out.println("Given year is leap year");
				}else{
					System.out.println("Given year is not leap year");
				}
			}else{
				System.out.println("Given year is leap year");
			}
		}else{
			System.out.println("Given year is not leap year");
		}
	}
}