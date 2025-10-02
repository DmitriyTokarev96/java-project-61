package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Random;

public class ProgressionGame {
    private static final String GAME_DESCRIPTION = "What number is missing in the progression?";
    private static final int MIN_LENGTH = 5;
    private static final int MAX_LENGTH = 10;
    private static final int MIN_START = 1;
    private static final int MAX_START = 50;
    private static final int MIN_STEP = 1;
    private static final int MAX_STEP = 10;

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
            int length = random.nextInt(MAX_LENGTH - MIN_LENGTH + 1) + MIN_LENGTH;
            int start = random.nextInt(MAX_START - MIN_START + 1) + MIN_START;
            int step = random.nextInt(MAX_STEP - MIN_STEP + 1) + MIN_STEP;
            int hiddenIndex = random.nextInt(length);

            int[] progression = generateProgression(start, step, length);
            int hiddenNumber = progression[hiddenIndex];

            String question = createQuestionString(progression, hiddenIndex);

            questionsAndAnswers[i][0] = question;
            questionsAndAnswers[i][1] = String.valueOf(hiddenNumber);
        }

        return questionsAndAnswers;
    }

    private static int[] generateProgression(int start, int step, int length) {
        int[] progression = new int[length];
        for (int i = 0; i < length; i++) {
            progression[i] = start + i * step;
        }
        return progression;
    }

    private static String createQuestionString(int[] progression, int hiddenIndex) {
        StringBuilder question = new StringBuilder();

        for (int i = 0; i < progression.length; i++) {
            if (i == hiddenIndex) {
                question.append("..");
            } else {
                question.append(progression[i]);
            }

            if (i < progression.length - 1) {
                question.append(" ");
            }
        }

        return question.toString();
    }
}