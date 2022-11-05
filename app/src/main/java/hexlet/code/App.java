package hexlet.code;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet\n2 - Even\n3 - Calc\n4 - GCD\n5 - Progression\n6 - Prime\n0 - Exit");
        System.out.print("Your choice: ");
        final int greet = 1;
        final int even = 2;
        final int calc = 3;
        final int gcd = 4;
        final int progression = 5;
        final int prime = 6;

        int choice = input.nextInt();

        switch (choice) {
            case greet:
                Cli.greeting();
                break;
            case even:
                ParityChecker.run();
                break;
            case calc:
                Calc.run();
                break;
            case gcd:
                Nod.run();
                break;
            case progression:
                Progression.run();
                break;
            case prime:
                Prime.run();
                break;
            default:
                break;
        }
    }
}
