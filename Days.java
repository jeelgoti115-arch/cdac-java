// Problem 1: Days of the Week
// Task: Write a program that takes an integer input (1-7) from the user and prints the
// corresponding day of the week. Use a switch statement to handle the conversion

class Days {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);

        switch (n) {
            case 1:
                System.out.println("Monday");
                break;

            case 2:
                System.out.println("Tuesday");
                break;

            case 3:
                System.out.println("Wednesday");
                break;

            case 4:
                System.out.println("Thursday");
                break;

            case 5:
                System.out.println("Friday");
                break;

            case 6:
                System.out.println("Saturday");
                break;

            case 7:
                System.out.println("Sunday");
                break;

            default:
                System.out.println("Invalid input. Please enter a number between 1 and 7.");
        }
    }
}
