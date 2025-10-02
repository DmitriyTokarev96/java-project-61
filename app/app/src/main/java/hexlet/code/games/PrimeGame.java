package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Random;

public class PrimeGame {
    private static final String GAME_DESCRIPTION = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
    private static final int MIN_NUMBER = 2;
    private static final int MAX_NUMBER = 100;

    public static void play() {
        String[][] questionsAndAnswers = generateQuestionsAndAnswers();
        Engine.runGame(GAME_DESCRIPTION, questionsAndAnswers);
    }

    private static String[][] generateQuestionsAndAnswers() {
        final int questionsCount = Engine.getQuestionsCount();
        String[][] questionsAndAnswers = new String[questionsCount][2];
        // Using java.util.Random is safe for gaming purposes
        Random random = new Random();

        for (int i = 0; i < questionsCount; i++) {
            int number = random.nextInt(MAX_NUMBER - MIN_NUMBER + 1) + MIN_NUMBER;
            boolean isPrime = isPrime(number);
            String correctAnswer = isPrime ? "yes" : "no";

            questionsAndAnswers[i][0] = String.valueOf(number);
            questionsAndAnswers[i][1] = correctAnswer;
        }

        return questionsAndAnswers;
    }

    private static boolean isPrime(int number) {
        if (number < 2) {
            return false;
        }

        if (number == 2) {
            return true;
        }

        if (number % 2 == 0) {
            return false;
        }

        // Check divisors only up to the square root of the number
        final int startDivisor = 3;
        for (int i = startDivisor; i * i <= number; i += 2) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }
}