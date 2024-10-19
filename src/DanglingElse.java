public class DanglingElse {
    public static void main(String[] args) {
        int x = 9;
        int y = 11;

            // Example 1
        System.out.println("Example 1:");
        if (x < 10)
            if (y > 10)
                System.out.println("*****");
        else
            System.out.println("#####");
            System.out.println("$$$$$");

            // Now changing x = 11 and y = 9
            x = 11;
            y = 9;

            System.out.println("Example 2:");
            if (x < 10)
                if (y > 10)
                    System.out.println("*****");
                else
                    System.out.println("#####");
            System.out.println("$$$$$");

            // Example 2
            x = 9;
            y = 11;
            System.out.println("Example 3:");
            if (x < 10) {
                if (y > 10) {
                    System.out.println("*****");
                }
            } else {
                System.out.println("#####");
            }
            System.out.println("$$$$$");

            // Now changing x = 11 and y = 9
            x = 11;
            y = 9;

            System.out.println("Example 4:");
            if (x < 10) {
                if (y > 10) {
                    System.out.println("*****");
                }
            } else {
                System.out.println("#####");
            }
            System.out.println("$$$$$");
            System.out.println("$$$$$");
        }
    }

