public class PythagoreanTriples {

    public static void main(String[] args) {
        System.out.printf("%-10s %-10s %-10s%n", "Side 1", "Side 2", "Hypotenuse");
        System.out.println("--------------------------------");

        // Triple nested loop to find Pythagorean triples
        for (int side1 = 1; side1 <= 500; side1++) {
            for (int side2 = side1; side2 <= 500; side2++) {
                for (int hypotenuse = side2; hypotenuse <= 500; hypotenuse++) {
                    // Check if it forms a Pythagorean triple
                    if (side1 * side1 + side2 * side2 == hypotenuse * hypotenuse) {
                        System.out.printf("%-10d %-10d %-10d%n", side1, side2, hypotenuse);
                    }
                }
            }
        }
    }
}