class Calculator{
	double num1;
	double num2;
	Calculator(double num1, double num2){
			this.num1 = num1;
			this.num2 = num2;
	} 

	public double add(){
			return num1+num2;
	}
	public double sub(){
			return num1-num2;
	}
	public double mul(){
			return num1*num2;
	}
	public double div(){
			return num1/num2;
	}
}

public class Calculator8 {
	public static void main(String[] args) {
		Calculator c = new Calculator(12, 8);
		System.out.println("The addition of two numbers: "+c.add());
		System.out.println("The subtraction of two numbers: "+c.sub());
		System.out.println("The multiplication of two numbers: "+c.mul());
		System.out.println("The division of two numbers: "+c.div());
	}
}
