// Problem 4: Number to Word Conversion
// Task: Write a program that takes an integer input (0-5) from the user and prints the
// corresponding word (e.g., 0 -> "Zero", 1 -> "One"). Use a switch statement to handle the
// conversion.

class NtW{
	public static void main(String[] args) {
		int a = Integer.parseInt(args[0]);

		switch(a){
		case 0:
			System.out.println("zero");
			break;
		case 1:
			System.out.println("one");
			break;
		case 2:
			System.out.println("two");
			break;
		case 3:
			System.out.println("three");
			break;
		case 4:
			System.out.println("four");
			break;
		case 5:
			System.out.println("five");
			break;
		default:
			System.out.println("invalid! enter between 0-5.");
		}
	}
}