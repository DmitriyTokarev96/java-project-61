package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Random;

public class GcdGame {
    private static final String GAME_DESCRIPTION = "Find the greatest common divisor of given numbers.";
    private static final int MAX_NUMBER = 100;
    private static final int MIN_NUMBER = 1;

    public static void play() {
        String[][] questionsAndAnswers = generateQuestionsAndAnswers();
        Engine.runGame(GAME_DESCRIPTION, questionsAndAnswers);
    }

    private static String[][] generateQuestionsAndAnswers() {
        String[][] questionsAndAnswers = new String[3][2];
        // Using java.util.Random is safe for gaming purposes
        Random random = new Random();
        for (int i = 0; i < 3; i++) {
            int number1 = random.nextInt(MAX_NUMBER) + MIN_NUMBER;
            int number2 = random.nextInt(MAX_NUMBER) + MIN_NUMBER;
            String question = number1 + " " + number2;
            int correctAnswer = gcd(number1, number2);
            questionsAndAnswers[i][0] = question;
            questionsAndAnswers[i][1] = String.valueOf(correctAnswer);
        }
        return questionsAndAnswers;
    }

    private static int gcd(int a, int b) {
        // Euclidean algorithm for finding GCD
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
