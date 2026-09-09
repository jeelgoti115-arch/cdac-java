// class Max{
// 	public static void main(String[] args) {
// 		int a = Integer.parseInt(args[0]);
// 		int b = Integer.parseInt(args[1]);
// 		int c = Integer.parseInt(args[2]);

// 		if(a > b){
// 			if(a > c){
// 				System.out.println("largest is" + a);
// 			}
// 			else{
// 				System.out.println("largest is" + c);
// 			}
			
// 		}else if(b > c){
// 				System.out.println("largest is" + b);
// 		}else{
// 			System.out.println("largest is" + c);
// 		}

// 	}
// }


///==========================================================================

class Max{
	public static void main(String[] args) {
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		int c = Integer.parseInt(args[2]);

		if (a>b && a>c){
			System.out.println("Largest number is " +a);
		}else if (b>a && b>c){
			System.out.println("Largest number is " +b);

		}else if (c>a && c>b){
			System.out.println("Largest number is "+c);
		}
		else {
			System.out.println("Two or more largest number");
		}
	}
}