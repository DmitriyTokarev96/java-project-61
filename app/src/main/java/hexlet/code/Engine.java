package hexlet.code;

import java.util.Scanner;

public class Engine {
    public static void runGame(Class<?> gameClass) {
        try {
            String description = (String) gameClass.getMethod("getDescription").invoke(null);
            System.out.println(description);

            String question = (String) gameClass.getMethod("generateQuestion").invoke(null);
            System.out.println("Question: " + question);

            Scanner scanner = new Scanner(System.in);
            System.out.print("Your answer: ");
            String userAnswer = scanner.nextLine();

            String correctAnswer = (String) gameClass.getMethod("getCorrectAnswer").invoke(null);
            if (userAnswer.equals(correctAnswer)) {
                System.out.println("Correct!");
            } else {
                System.out.println("Wrong answer! The correct answer is: " + correctAnswer);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

