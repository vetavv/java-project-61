package hexlet.code;

import java.util.Scanner;

public class Cli {

    static void greeting() {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        String name = input.nextLine();
        System.out.println("Hello, " + name + "!");
    }
}
