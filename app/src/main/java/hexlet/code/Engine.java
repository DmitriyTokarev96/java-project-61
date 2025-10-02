package hexlet.code;

import java.util.Scanner;

public class Engine {
    private static final int QUESTIONS_COUNT = 3;
    
    public static void runGame(String gameDescription, String[][] questionsAndAnswers) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        String name = scanner.nextLine();
        System.out.println("Hello, " + name + "!");
        
        System.out.println(gameDescription);
        
        for (int i = 0; i < QUESTIONS_COUNT; i++) {
            String question = questionsAndAnswers[i][0];
            String correctAnswer = questionsAndAnswers[i][1];
            
            System.out.println("Question: " + question);
            System.out.print("Your answer: ");
            String userAnswer = scanner.nextLine().trim();
            
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
