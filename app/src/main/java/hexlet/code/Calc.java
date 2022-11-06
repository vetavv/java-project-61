package hexlet.code;

import java.util.Random;

public class Calc {
    private static String greetingLine = "What is the result of the expression?";
    private static int newQuestion() {
        Random random = new Random();
        final var randomNumberRange = 10;
        final var randomOperatorRange = 3;
        int number1 = random.nextInt(randomNumberRange);
        int number2 = random.nextInt(randomNumberRange);
        int operator = random.nextInt(randomOperatorRange);
        int rightAnswer = 0;

        switch (operator) {
            case 0:
                Engine.setQuestion(number1 + " + " + number2);
                rightAnswer = number1 + number2;
                break;
            case 1:
                Engine.setQuestion(number1 + " - " + number2);
                rightAnswer = number1 - number2;
                break;
            case 2:
                Engine.setQuestion(number1 + " * " + number2);
                rightAnswer = number1 * number2;
                break;
            default:
                break;
        }
        Engine.setRightAnswer(Integer.toString(rightAnswer));
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
