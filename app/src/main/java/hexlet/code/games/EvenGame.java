package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Random;

public class EvenGame {
    private static final String GAME_DESCRIPTION = "Answer 'yes' if the number is even, otherwise answer 'no'.";
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
            int number = random.nextInt(MAX_NUMBER) + 1;
            boolean isEven = number % 2 == 0;
            String correctAnswer = isEven ? "yes" : "no";
            questionsAndAnswers[i][0] = String.valueOf(number);
            questionsAndAnswers[i][1] = correctAnswer;
        }
        return questionsAndAnswers;
    }
}
