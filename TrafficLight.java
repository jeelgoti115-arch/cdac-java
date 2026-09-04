// Problem 3: Traffic Light System
// Task: Write a program that takes a character input (R, Y, G) and prints the corresponding traffic
// light action (Stop, Wait, Go). Use a switch statement to handle the conversion.

class TrafficLight{
	public static void main(String[] args) {
		char l = args[0].charAt(0);

		switch(l){
			case 'r':
				System.out.println("Stop");
				break;
			case 'y':
				System.out.println("Wait");
				break;
			case 'g':
				System.out.println("Go");
				break;
			case 'R':
				System.out.println("Stop");
				break;
			case 'Y':
				System.out.println("Wait");
				break;
			case 'G':
				System.out.println("Go");
				break;
			default :
				System.out.println("Invalid input! Enter Valid input.");
		}
	}
}