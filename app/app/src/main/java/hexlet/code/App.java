package hexlet.code;

import hexlet.code.games.EvenGame;
import hexlet.code.games.CalcGame;
import hexlet.code.games.GcdGame;
import hexlet.code.games.ProgressionGame;
import hexlet.code.games.PrimeGame;
import java.util.Scanner;

public class App {
    private static final int GREET_CHOICE = 1;
    private static final int EVEN_CHOICE = 2;
    private static final int CALC_CHOICE = 3;
    private static final int GCD_CHOICE = 4;
    private static final int PROGRESSION_CHOICE = 5;
    private static final int PRIME_CHOICE = 6;
    private static final int EXIT_CHOICE = 0;

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Please enter the game number and press Enter.");
            System.out.println("1 - Greet");
            System.out.println("2 - Even");
            System.out.println("3 - Calc");
            System.out.println("4 - GCD");
            System.out.println("5 - Progression");
            System.out.println("6 - Prime");
            System.out.println("0 - Exit");
            System.out.print("Your choice: ");

            int choice;
            try {
                choice = scanner.nextInt();
            } catch (Exception e) {
                System.out.println("Invalid input. Please enter a number.");
                return;
            }

            switch (choice) {
                case GREET_CHOICE:
                    Cli.welcome();
                    break;
                case EVEN_CHOICE:
                    EvenGame.play();
                    break;
                case CALC_CHOICE:
                    CalcGame.play();
                    break;
                case GCD_CHOICE:
                    GcdGame.play();
                    break;
                case PROGRESSION_CHOICE:
                    ProgressionGame.play();
                    break;
                case PRIME_CHOICE:
                    PrimeGame.play();
                    break;
                case EXIT_CHOICE:
                    System.out.println("Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }
    }
}
