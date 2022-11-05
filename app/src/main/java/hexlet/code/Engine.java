package hexlet.code;

import java.util.Scanner;

public class Engine {
    public
        static String name;
    static boolean roundResult = false;
    static String question;
    static String rightAnswer;
    public static void gameRound(int newQuestion) {
        Scanner input = new Scanner(System.in);
        System.out.println("Question: " + question);

        System.out.print("Your answer: ");
        String answer = input.nextLine();

        roundResult = rightAnswer.equals(answer);

        if (roundResult) {
            System.out.println("Correct!");
        } else {
            System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '" + rightAnswer + "'");
        }
    }

    public

        static void greeting(String greetingLine) {
        Scanner input = new Scanner(System.in);
        System.out.println("\nWelcome to the Brain Games!");
        System.out.print("May I have your name? ");
        name = input.nextLine();
        System.out.println("Hello, " + name + "!");
        System.out.println(greetingLine);
    }
}



