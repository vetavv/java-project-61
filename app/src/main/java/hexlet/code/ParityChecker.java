package hexlet.code;

import java.util.Random;

public class ParityChecker {
    private
        static String greetingLine = "Answer 'yes' if the number is even, otherwise answer 'no'.";
    static int newQuestion() {
        Random random = new Random();
        final int randomNumberRange = 10000;
        int newNumber = random.nextInt(randomNumberRange);
        String rightAnswer = newNumber % 2 == 0 ? "yes" : "no";

        Engine.setQuestion(Integer.toString(newNumber));
        Engine.setRightAnswer(rightAnswer);
        return 0;
    }

    public static int run() {
        Engine.greeting(greetingLine);
        final var roundsNumber = 3;
        for (int i = 0; i < roundsNumber; i++) {
            Engine.gameRound(newQuestion());
            if (!Engine.getRoundResult()) {
                System.out.println("Let's try again, " + Engine.getName() + "!");
                return 0;
            }
        }
        System.out.println("Congratulations, " + Engine.getName() + "!");
        return 0;
    }
}



