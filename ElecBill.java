public class ElecBill {
	public static void main(String[] args) {
		int unit = Integer.parseInt(args[0]);

		System.out.println("number of unit consumed :"+unit);

		if(unit <= 100){
			int bill = (unit * 5);
			System.out.println("per unit price is 5");
			System.out.println("Your Bill is :"+bill);
		}else if(unit >= 101 && unit <= 200){
			int bill = (unit * 6);
			System.out.println("per unit price is 6");
			System.out.println("Your Bill is :"+bill);
		}else if(unit >= 201 && unit <= 300){
			int bill = (unit * 7);
			System.out.println("per unit price is 7");
			System.out.println("Your Bill is :"+bill);
		}else{
			int bill = (unit * 8);
			System.out.println("per unit price is 8");
			System.out.println("Your Bill is :"+bill);
		}
	}
}
