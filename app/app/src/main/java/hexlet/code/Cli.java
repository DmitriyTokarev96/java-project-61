package hexlet.code;

import java.util.Scanner;

public class Cli {
    public static void welcome() {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Welcome to the Brain Games!");
            System.out.println("May I have your name?");
            String name = sc.nextLine().trim();

            // User name validation
            if (name.isEmpty()) {
                name = "Anonymous";
            }

            System.out.println("Hello, " + name + "!");
        }
    }
}
