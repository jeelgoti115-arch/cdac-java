// 13. Write a program to calculate the power of a number using a loop.
import java.util.Scanner;
public class PowerCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the base: ");
        int base = scanner.nextInt();
        System.out.print("Enter the exponent (integer): ");
        int exponent = scanner.nextInt();
        int result = calculatePower(base, exponent);
        System.out.println(base + " ^ " + exponent + " = " + result);
        scanner.close();
    }

    public static int calculatePower(int base, int exponent) {
        int result = 1;
        int absExponent = Math.abs(exponent);
        for (int i = 0; i < absExponent; i++) {
            result *= base;
        }
        if (exponent < 0) {
            return 1 / result;
        }
        return result;
    }
}