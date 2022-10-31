package hexlet.code;

import java.util.Scanner;

public class Cli {
    static public void greeting() {
        Scanner input = new Scanner(System.in);
        System.out.print("May I have your name? ");
        String name = input.nextLine();
        System.out.println("Hello, " + name + "!");
    }

}
