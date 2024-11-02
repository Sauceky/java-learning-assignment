import java.util.Scanner;

public class GlobalWarningQuiz {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int score = 0;

        // Array of questions
        String[] questions = {
                "1. Which greenhouse gas is most commonly associated with global warming?\n" +
                        "   1. Methane\n   2. Carbon Dioxide\n   3. Nitrous Oxide\n   4. Water Vapor",

                "2. What does the Intergovernmental Panel on Climate Change (IPCC) conclude about human impact on global warming?\n" +
                        "   1. Human impact is minimal.\n   2. Human activities are the primary cause of recent warming.\n" +
                        "   3. It is uncertain whether humans impact the climate.\n   4. The effect of human activity will only be felt in the distant future.",

                "3. What is the viewpoint of many global warming skeptics?\n" +
                        "   1. Global warming is not happening at all.\n   2. The warming trend is part of a natural climate cycle.\n" +
                        "   3. CO₂ has no impact on the environment.\n   4. Scientists unanimously agree on man-made warming.",

                "4. Which of these factors is sometimes cited as a possible cause of natural climate change?\n" +
                        "   1. Ocean acidification\n   2. CO₂ emissions\n   3. Solar activity and volcanic eruptions\n   4. Deforestation",

                "5. What year did Al Gore’s film “An Inconvenient Truth” debut?\n" +
                        "   1. 2003\n   2. 2005\n   3. 2006\n   4. 2007"
        };

        // Array of correct answers
        int[] answers = {2, 2, 2, 3, 3};

        // Quiz loop
        for (int i = 0; i < questions.length; i++) {
            System.out.println(questions[i]);
            System.out.print("Your answer: ");
            int userAnswer = input.nextInt();

            if (userAnswer == answers[i]) {
                score++;
            }
        }

        // Display result
        System.out.println("\nYou got " + score + " correct answers out of 5.");

        // Feedback based on score
        switch (score) {
            case 5:
                System.out.println("Excellent");
                break;
            case 4:
                System.out.println("Very good");
                break;
            default:
                System.out.println("Time to brush up on your knowledge of global warming.");
                System.out.println("Some resources to learn more:");
                System.out.println(" - National Aeronautics and Space Administration (NASA): https://climate.nasa.gov");
                System.out.println(" - Intergovernmental Panel on Climate Change (IPCC): https://www.ipcc.ch");
                System.out.println(" - Skeptical Science (a website addressing climate skepticism): https://www.skepticalscience.com");
                System.out.println(" - U.S. Environmental Protection Agency (EPA): https://www.epa.gov/climate-change");
        }

        input.close();
    }
}