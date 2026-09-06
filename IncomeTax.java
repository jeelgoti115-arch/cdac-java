public class IncomeTax {
	public static void main(String[] args) {
		int salary = Integer.parseInt(args[0]);

		System.out.println("Slary is : "+salary);

		if(salary>1000000){
			System.out.println("u need to pay 30% ");
			double tax =  salary * 0.3;
			System.out.println("total payable tax is :"+tax);
		}else if(salary>=500001 && salary<=1000000){
			System.out.println("u need to pay 20% ");
			double tax =  salary * 0.2;
			System.out.println("total payable tax is :"+tax);
		}else if(salary>=250001 && salary<=500000){
			System.out.println("u need to pay 5% ");
			double tax =  salary * 0.05;
			System.out.println("total payable tax is :"+tax);
		}else{
			System.out.println("no need to pay tax");
		}
	}
}