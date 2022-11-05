package hexlet.code;

import java.util.Random;

public class Prime {
    private
    static String greetingLine = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";

    static int newQuestion() {
        Random random = new Random();
        int question = random.nextInt(50);
        Engine.question = Integer.toString(question);

        for (int i = 2; i <= Math.sqrt(question); i++) {
            if (question % i == 0) {
                Engine.rightAnswer = "no";
                return 0;
            }
        }
        Engine.rightAnswer = "yes";
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