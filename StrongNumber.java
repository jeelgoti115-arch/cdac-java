// 29. Write a program to check if a given number is a strong number.
import java.util.Scanner;
public class StrongNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        if (isStrong(num)) {
            System.out.println(num + " is a strong number.");
        } else {
            System.out.println(num + " is not a strong number.");
        }
        scanner.close();
    }
    public static boolean isStrong(int num) {
        if (num <= 0) {
            return false;
        }
        int originalNum = num;
        int sum = 0;
        while (num > 0) {
            int digit = num % 10;
            sum += factorial(digit);
            num /= 10;
        }
        return sum == originalNum;
    }
    public static int factorial(int n) {
        int fact = 1;
        for (int i = 2; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }
}
