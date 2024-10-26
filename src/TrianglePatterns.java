public class TrianglePatterns {
    public static void main(String[] args) {
        int rows = 10; // Total rows for each pattern

        // Pattern (a)
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print('*');
            }
            System.out.println();
        }

        System.out.println(); // Spacer between patterns

        // Pattern (b)
        for (int i = rows; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print('*');
            }
            System.out.println();
        }

        System.out.println(); // Spacer between patterns

        // Pattern (c)
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print(' ');
            }
            for (int j = i; j <= rows; j++) {
                System.out.print('*');
            }
            System.out.println();
        }

        System.out.println(); // Spacer between patterns

        // Pattern (d)
        for (int i = 1; i <= rows; i++) {
            for (int j = i; j < rows; j++) {
                System.out.print(' ');
            }
            for (int j = 1; j <= i; j++) {
                System.out.print('*');
            }
            System.out.println();
        }
    }
}