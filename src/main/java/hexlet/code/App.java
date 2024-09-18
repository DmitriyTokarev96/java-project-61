package hexlet.code;

import java.util.Scanner;
import hexlet.code.games.Calc;
import hexlet.code.games.Even;
import hexlet.code.games.GCDGame;
import hexlet.code.games.ProgressionGame;
import hexlet.code.games.PrimeGame;

public class App {
    public static void main(String[] args) {
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("3 - Calc");
        System.out.println("4 - GCD");
        System.out.println("5 - Progression");
        System.out.println("6 - Prime");
        System.out.println("0 - Exit");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Your choice: ");
        int gameNumber = scanner.nextInt();

        switch (gameNumber) {
            case 1:
                Cli.greet();
                break;
            case 2:
                Engine.runGame(new Even());
                break;
            case 3:
                Engine.runGame(new Calc());
                break;
            case 4:
                Engine.runGame(new GCDGame());
                break;
            case 5:
                Engine.runGame(new ProgressionGame());
                break;
            case 6:
                Engine.runGame(new PrimeGame());
                break;
            case 0:
                System.out.println("Goodbye!");
                break;
            default:
                System.out.println("Invalid game number.");
                break;
        }
    }
}
