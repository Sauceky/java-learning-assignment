public class FactorialCalculator {
    public static void main(String[] args) {
        System.out.printf("%-2s %-20s%n", "n", "n!");

        for (int i = 1; i <= 20; i++) {
            System.out.printf("%-2d %-20d%n", i, factorial(i));
        }
    }

    public static long factorial(int n) {
        long result = 1;

        for (int i = 1; i <= n; i++) {
            result *= i;
        }

        return result;
    }
}