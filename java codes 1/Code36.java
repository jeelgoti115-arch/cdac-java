import java.util.Scanner;
public class Code36 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = Math.abs(scanner.nextInt());

        int result;
        if (num == 0) {
            result = 0;
        } else if (num % 9 == 0) {
            result = 9;
        } else {
            result = num % 9;
        }

        System.out.println("Single-digit sum: " + result);
        scanner.close();
    }
}