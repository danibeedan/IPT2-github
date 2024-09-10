import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the calculator!");
        System.out.println("Choose an operation:");
        System.out.println("1. Addition (+)");
        System.out.println("2. Subtraction (-)");
        System.out.println("3. Multiplication (*)");
        System.out.println("4. Division (/)");
        System.out.println("5. Modulus (%)");

        int choice = scanner.nextInt();

        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();

        double result = 0;

        switch (choice) {
            case 1:
                result = addition(num1, num2);
                break;
            case 2:
                result = subtraction(num1, num2);
                break;
            case 3:
                result = multiplication(num1, num2);
                break;
            case 4:
                result = division(num1, num2);
                break;
            case 5:
                result = modulus(num1, num2);
                break;
            default:
                System.out.println("Invalid choice.");
                return;
        }

        System.out.println("Result: " + result);
    }

    // addition method
    public static double addition(double num1, double num2) {
        return num1 + num2;
    }

    // subtraction method
    public static double subtraction(double num1, double num2) {
        return num1 - num2;
    }

    // multiplication method
    public static double multiplication(double num1, double num2) {
        return num1 * num2;
    }

    // division method
    public static double division(double num1, double num2) {
        if (num2 == 0) {
            System.out.println("Error: Cannot divide by zero.");
            return Double.NaN; // Return NaN (Not a number)
        }
        return num1 / num2;
    }

    // modulus method
    public static double modulus(double num1, double num2) {
        return num1 % num2;
    }
}
