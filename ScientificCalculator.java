
import java.util.Scanner;

public class ScientificCalculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int choice;
        double num1, num2, result;

        do {
            System.out.println("\n================================");
            System.out.println("     SCIENTIFIC CALCULATOR");
            System.out.println("================================");
            System.out.println("1. Addition (+)");
            System.out.println("2. Subtraction (-)");
            System.out.println("3. Multiplication (*)");
            System.out.println("4. Division (/)");
            System.out.println("5. Power (x^y)");
            System.out.println("6. Square Root");
            System.out.println("7. Cube Root");
            System.out.println("8. Sin");
            System.out.println("9. Cos");
            System.out.println("10. Tan");
            System.out.println("11. Log (base 10)");
            System.out.println("12. Natural Log (ln)");
            System.out.println("13. Factorial");
            System.out.println("14. Percentage");
            System.out.println("0. Exit");
            System.out.println("================================");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter two numbers: ");
                    num1 = sc.nextDouble();
                    num2 = sc.nextDouble();
                    result = num1 + num2;
                    System.out.println("Result = " + result);
                    break;

                case 2:
                    System.out.print("Enter two numbers: ");
                    num1 = sc.nextDouble();
                    num2 = sc.nextDouble();
                    result = num1 - num2;
                    System.out.println("Result = " + result);
                    break;

                case 3:
                    System.out.print("Enter two numbers: ");
                    num1 = sc.nextDouble();
                    num2 = sc.nextDouble();
                    result = num1 * num2;
                    System.out.println("Result = " + result);
                    break;

                case 4:
                    System.out.print("Enter two numbers: ");
                    num1 = sc.nextDouble();
                    num2 = sc.nextDouble();
                    if (num2 != 0) {
                        result = num1 / num2;
                        System.out.println("Result = " + result);
                    } else {
                        System.out.println("Error: Division by zero!");
                    }
                    break;

                case 5:
                    System.out.print("Enter base and exponent: ");
                    num1 = sc.nextDouble();
                    num2 = sc.nextDouble();
                    result = Math.pow(num1, num2);
                    System.out.println("Result = " + result);
                    break;

                case 6:
                    System.out.print("Enter a number: ");
                    num1 = sc.nextDouble();
                    if (num1 >= 0) {
                        result = Math.sqrt(num1);
                        System.out.println("Result = " + result);
                    } else {
                        System.out.println("Error: Negative number!");
                    }
                    break;

                case 7:
                    System.out.print("Enter a number: ");
                    num1 = sc.nextDouble();
                    result = Math.cbrt(num1);
                    System.out.println("Result = " + result);
                    break;

                case 8:
                    System.out.print("Enter angle in degrees: ");
                    num1 = sc.nextDouble();
                    result = Math.sin(Math.toRadians(num1));
                    System.out.println("Result = " + result);
                    break;

                case 9:
                    System.out.print("Enter angle in degrees: ");
                    num1 = sc.nextDouble();
                    result = Math.cos(Math.toRadians(num1));
                    System.out.println("Result = " + result);
                    break;

                case 10:
                    System.out.print("Enter angle in degrees: ");
                    num1 = sc.nextDouble();
                    if (Math.abs(Math.cos(Math.toRadians(num1))) < 1e-12) {
                        System.out.println("Error: Tangent is undefined!");
                    } else {
                        result = Math.tan(Math.toRadians(num1));
                        System.out.println("Result = " + result);
                    }
                    break;

                case 11:
                    System.out.print("Enter a number: ");
                    num1 = sc.nextDouble();
                    if (num1 > 0) {
                        result = Math.log10(num1);
                        System.out.println("Result = " + result);
                    } else {
                        System.out.println("Error: Enter a positive number!");
                    }
                    break;

                case 12:
                    System.out.print("Enter a number: ");
                    num1 = sc.nextDouble();
                    if (num1 > 0) {
                        result = Math.log(num1);
                        System.out.println("Result = " + result);
                    } else {
                        System.out.println("Error: Enter a positive number!");
                    }
                    break;

                case 13:
                    System.out.print("Enter a non-negative integer: ");
                    int n = sc.nextInt();
                    if (n < 0) {
                        System.out.println("Error: Factorial is not defined!");
                    } else {
                        long factorial = 1;
                        for (int i = 1; i <= n; i++) {
                            factorial *= i;
                        }
                        System.out.println("Factorial = " + factorial);
                    }
                    break;

                case 14:
                    System.out.print("Enter total and percentage: ");
                    num1 = sc.nextDouble();
                    num2 = sc.nextDouble();
                    result = (num1 * num2) / 100;
                    System.out.println("Percentage = " + result);
                    break;

                case 0:
                    System.out.println("Thank you for using Calculator!");
                    break;

                default:
                    System.out.println("Invalid choice! Try again.");
            }

        } while (choice != 0);

        sc.close();
    }
}
