package hexlet.code;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet\n2 - Even\n3 - Calc\n4 - GCD\n5 - Progression\n6 - Prime\n0 - Exit");
        System.out.print("Your choice: ");
        int choice = input.nextInt();
        switch (choice) {
            case 1:
                Cli.greeting();
                break;
            case 2:
                ParityChecker.run();
                break;
            case 3:
                Calc.run();
                break;
            case 4:
                Nod.run();
                break;
            case 5:
                Progression.run();
                break;
            case 6:
                Prime.run();
                break;
            default:
                break;
        }
    }
}
