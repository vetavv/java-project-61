package hexlet.code;

import java.util.Random;

public class Progression {
    private
        static String greetingLine = "What number is missing in the progression?";
    static int newQuestion() {
        Random random = new Random();
        int randomNumberRange = 100;
        int currentElement = random.nextInt(randomNumberRange);

        int minElementsNumber = 5;
        int maxElementNumber = 10;

        int elementsNumber = random.nextInt(minElementsNumber, maxElementNumber);
        int hiddenElementNumber = random.nextInt(elementsNumber);
        int minProgressionStep = 1;

        int maxProgressionStep = 10;
        int progressionStep = random.nextInt(minProgressionStep, maxProgressionStep);

        String progressionLine = Integer.toString(currentElement);

        for (int i = 0; i < elementsNumber; i++) {
            if (i == hiddenElementNumber) {
                progressionLine += " ..";
                currentElement += progressionStep;
                Engine.rightAnswer = Integer.toString(currentElement);
                continue;
            }
            currentElement += progressionStep;
            progressionLine += " " + Integer.toString(currentElement);
        }
        Engine.question = progressionLine;
        return 0;
    }

    public
        static int run() {
        Engine.greeting(greetingLine);
        int roundsNumber = 3;
        for (int i = 0; i < roundsNumber; i++) {
            Engine.gameRound(newQuestion());
            if (!Engine.roundResult) {
                System.out.println("Let's try again, " + Engine.name + "!");
                return 0;
            }
        }
        System.out.println("Congratulations, " + Engine.name + "!");
        return 0;
    }
}
