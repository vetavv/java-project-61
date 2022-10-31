package hexlet.code;

import java.util.Random;
import java.util.Scanner;

public class ParityChecker {
    static void parityCheckerGame() {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        String name = input.nextLine();
        System.out.println("Hello, " + name + "!");
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        int loose = 0;
        int win = 3;
        int rightCount = 0;

        do {
            Random random = new Random();
            int number = random.nextInt();
            System.out.println("Question: " + number);
            String answer = input.nextLine();
            if ((number % 2 == 0 && answer.equals("yes")) || (number % 2 != 0 && answer.equals("no"))) {
                rightCount += 1;
                System.out.println("Correct!");
            } else {
                rightCount = 0;
                System.out.print("'" + answer + "'" + " is wrong answer ;(.");
                System.out.println(" Correct answer was " + (answer.equals("'yes'.") ? "'no'." : "'yes'."));
                System.out.println("Let's try again, " + name + "!");
            }
        } while (rightCount > loose && rightCount < win);
        if (rightCount == win) {
            System.out.println("Congratulations, " + name + "!");
        }
    }
}
