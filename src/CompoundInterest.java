public class CompoundInterest {
    public static void main(String[] args) {
        double principal = 1000.0;

        System.out.printf("%-7s %-15s %-10s%n", "Rate", "Year", "Amount");

        for (int rate = 5; rate <= 10; rate++) {
            double interestRate = rate / 100.0;

            for (int year = 1; year <= 10; year++) {
                double amount = principal * Math.pow(1.0 + interestRate, year);
                System.out.printf("%-7d %-15d $%-10.2f%n", rate, year, amount);
            }
            System.out.println(); // Separate each interest rate section
        }
    }
}