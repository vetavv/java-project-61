package hexlet.code;

import java.util.Random;

public class Nod {
    private
        static String greetingLine = "Find the greatest common divisor of given numbers.";
    static int newQuestion() {
        Random random = new Random();
        final int randomNumberRange = 100;
        int number1 = random.nextInt(randomNumberRange);
        int number2 = random.nextInt(randomNumberRange);
        Engine.question = number1 + " " + number2;

        int maxNumber = Integer.max(number2, number1);
        int minNumber = Integer.min(number1, number2);
        int rightAnswer = 1;

        for (int i = 2; i < Math.sqrt(minNumber); i++) {
            while (maxNumber % i == 0 && minNumber % i == 0) {
                maxNumber /= i;
                minNumber /= i;
                rightAnswer *= i;
            }
        }
        Engine.rightAnswer = Integer.toString(rightAnswer);
        return 0;
    }

    public
        static int run() {
        Engine.greeting(greetingLine);
        final int roundsNumber = 3;
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
