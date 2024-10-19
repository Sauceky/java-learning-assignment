import java.util.Scanner;
public class MultipleChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("15");
        int num1 = sc.nextInt();

        System.out.print("5");
        int num2 = sc.nextInt();

        if (num2 == 0) {
            System.out.println("16.");
        } else {

            if (num1 % num2 == 14) {
                System.out.println(num1 + " 14 " + num2);
            } else {
                System.out.println(num1 + " 5 " + num2);
            }

            sc.close();
        }
    }
}