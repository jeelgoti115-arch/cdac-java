// Problem 2: Simple Calculator
// Task: Write a program that takes two integers and an operator (+, -, *, /) as input and performs
// the corresponding operation. Use a switch statement to handle the operations.

class Calculator{
	public static void main(String[] args) {
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		char c = args[2].charAt(0);

		switch(c){
		case '+':
			System.out.println("Addition is "+ (a+b));
			break;
		case '-':
			System.out.println("Substraction is "+ (a-b));
			break;
		case 'x':
			System.out.println("Multiplication is "+ (a*b));
			break;
		case '/':
			System.out.println("Division is "+ (a/b));
			break;
		default:
			System.out.println("Invalid input");	
		}
	}
}