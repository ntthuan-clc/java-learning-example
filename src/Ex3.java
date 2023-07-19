import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Input second number: ");
        int num2 = scanner.nextInt();

        // Addition
        int sum = num1 + num2;
        System.out.println(num1 + " + " + num2 + " = " + sum);

        // Subtraction
        int difference = num1 - num2;
        System.out.println(num1 + " - " + num2 + " = " + difference);

        // Multiplication
        int product = num1 * num2;
        System.out.println(num1 + " x " + num2 + " = " + product);

        // Division
        if (num2 != 0) {
            double divisionResult = (double) num1 / num2;
            System.out.println(num1 + " / " + num2 + " = " + divisionResult);
        } else {
            System.out.println("Cannot divide by zero.");
        }

        // Remainder
        if (num2 != 0) {
            int remainder = num1 % num2;
            System.out.println(num1 + " mod " + num2 + " = " + remainder);
        } else {
            System.out.println("Cannot find the remainder when dividing by zero.");
        }

        scanner.close();
    }
}
