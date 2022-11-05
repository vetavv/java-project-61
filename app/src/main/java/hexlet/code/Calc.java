package hexlet.code;

import java.util.Random;
import java.util.Scanner;

public class Calc {
    private
    static String greetingLine = "What is the result of the expression?";
    static int newQuestion() {
        Random random = new Random();
        int number1 = random.nextInt(10);
        int number2 = random.nextInt(10);
        int operator = random.nextInt(3);
        int rightAnswer = 0;

        switch (operator) {
            case 0:
                Engine.question = number1 + " + " + number2;
                rightAnswer = number1 + number2;
                break;
            case 1:
                Engine.question = number1 + " - " + number2;
                rightAnswer = number1 - number2;
                break;
            case 2:
                Engine.question = number1 + " * " + number2;
                rightAnswer = number1 * number2;
                break;
            default:
                break;
        }
        Engine.rightAnswer = Integer.toString(rightAnswer);
        return 0;
    }

    public
    static int run() {
        Engine.greeting(greetingLine);
        int roundsNumber = 3;
        for (int i = 0; i < roundsNumber; i++) {
            Engine.gameRound(newQuestion());
            if (Engine.roundResult == false) {
                System.out.println("Let's try again, " + Engine.name + "!");
                return 0;
            }
        }
        System.out.println("Congratulations, " + Engine.name + "!");
        return 0;
    }
}
