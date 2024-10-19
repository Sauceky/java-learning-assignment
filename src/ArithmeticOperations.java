 import java.util.Scanner;
    public class ArithmeticOperations {
        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter the first integer: ");
            int num1 = scanner.nextInt();

            System.out.print("Enter the second integer: ");
            int num2 = scanner.nextInt();

            int sum = num1 + num2;
            int product = num1 * num2;
            int difference = num1 - num2;
            String quotient;

            if (num2 != 0) {
               quotient = String.valueOf((double) num1 / num2);
            } else {
                quotient = "undefined (division by zero)";
            }

            System.out.println("Sum: " + sum);
            System.out.println("Product: " + product);
            System.out.println("Difference: " + difference);
            System.out.println("Quotient: " + quotient);
        }
 }