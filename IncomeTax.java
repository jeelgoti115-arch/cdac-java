public class IncomeTax {
	public static void main(String[] args) {
		int salary = Integer.parseInt(args[0]);

		System.out.println("Slary is : "+salary);

		if(salary>1000000){
			System.out.println("u need to pay 30% ");
			int tax = (salary * 0.3);
		}else if(salary>50000){
			System.out.println("garib");
		}
	}
}
