package hexlet.code;

import java.util.Random;

public class Progression {
    private
        static String greetingLine = "What number is missing in the progression?";
    static int newQuestion() {
        Random random = new Random();
        final int randomNumberRange = 100;
        int currentElement = random.nextInt(randomNumberRange);

        final int minElementsNumber = 5;
        final int maxElementNumber = 10;

        int elementsNumber = random.nextInt(minElementsNumber, maxElementNumber);
        int hiddenElementNumber = random.nextInt(elementsNumber);
        final int minProgressionStep = 1;

        final int maxProgressionStep = 10;
        int progressionStep = random.nextInt(minProgressionStep, maxProgressionStep);

        String progressionLine = Integer.toString(currentElement);

        for (int i = 0; i < elementsNumber; i++) {
            if (i == hiddenElementNumber) {
                progressionLine += " ..";
                currentElement += progressionStep;
                Engine.setRightAnswer(Integer.toString(currentElement));
                continue;
            }
            currentElement += progressionStep;
            progressionLine += " " + Integer.toString(currentElement);
        }
        Engine.setQuestion(progressionLine);
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
