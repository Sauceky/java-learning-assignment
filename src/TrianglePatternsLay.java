public class TrianglePatternsLay {

    public static void main(String[] args) {
        int size = 10; // Size of each triangle

        for (int i = 1; i <= size; i++) {
            // Pattern 1: Left-aligned triangle
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            for (int j = i; j < size; j++) {
                System.out.print(" ");
            }
            System.out.print("   "); // Space between patterns

            // Pattern 2: Right-aligned triangle
            for (int j = i; j < size; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.print("   "); // Space between patterns

            // Pattern 3: Upside-down left-aligned triangle
            for (int j = i; j <= size; j++) {
                System.out.print("*");
            }
            System.out.print("   "); // Space between patterns

            // Pattern 4: Upside-down right-aligned triangle
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = i; j <= size; j++) {
                System.out.print("*");
            }

            // Move to the next line after printing all patterns in the row
            System.out.println();
        }
    }
}