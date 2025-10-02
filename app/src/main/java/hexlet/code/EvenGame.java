package hexlet.code;

import java.util.Random;
import java.util.Scanner;

public class EvenGame {
    private static final int QUESTIONS_COUNT = 3;

    public static void play() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        String name = scanner.nextLine();
        System.out.println("Hello, " + name + "!");

        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");

        for (int i = 0; i < QUESTIONS_COUNT; i++) {
            int number = random.nextInt(100) + 1; // Генерируем число от 1 до 100
            System.out.println("Question: " + number);
            System.out.print("Your answer: ");
            String userAnswer = scanner.nextLine().trim().toLowerCase();

            boolean isEven = number % 2 == 0;
            String correctAnswer = isEven ? "yes" : "no";

            if (userAnswer.equals(correctAnswer)) {
                System.out.println("Correct!");
            } else {
                System.out.println("'" + userAnswer + "' is wrong answer ;(. Correct answer was '" + correctAnswer + "'.");
                System.out.println("Let's try again, " + name + "!");
                scanner.close();
                return;
            }
        }
        
        System.out.println("Congratulations, " + name + "!");
scanner.close();
    }
}
