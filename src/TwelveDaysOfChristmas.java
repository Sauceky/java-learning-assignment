public class TwelveDaysOfChristmas {

    public static void main(String[] args) {
        for (int day = 1; day <= 12; day++) {
            System.out.println("On the " + getDay(day) + " day of Christmas, my true love gave to me:");

            for (int gift = day; gift >= 1; gift--) {
                if (day > 1 && gift == 1) {
                    System.out.print("and ");
                }
                System.out.println(getGift(gift));
            }
            System.out.println();
        }
    }

    // Switch statement for the day
    private static String getDay(int day) {
        switch (day) {
            case 1: return "first";
            case 2: return "second";
            case 3: return "third";
            case 4: return "fourth";
            case 5: return "fifth";
            case 6: return "sixth";
            case 7: return "seventh";
            case 8: return "eighth";
            case 9: return "ninth";
            case 10: return "tenth";
            case 11: return "eleventh";
            case 12: return "twelfth";
            default: return "";
        }
    }

    // Switch statement for the gifts
    private static String getGift(int gift) {
        switch (gift) {
            case 1: return "a Partridge in a Pear Tree.";
            case 2: return "two Turtle Doves,";
            case 3: return "three French Hens,";
            case 4: return "four Calling Birds,";
            case 5: return "five Gold Rings,";
            case 6: return "six Geese a Laying,";
            case 7: return "seven Swans a Swimming,";
            case 8: return "eight Maids a Milking,";
            case 9: return "nine Ladies Dancing,";
            case 10: return "ten Lords a Leaping,";
            case 11: return "eleven Pipers Piping,";
            case 12: return "twelve Drummers Drumming,";
            default: return "";
        }
    }
}