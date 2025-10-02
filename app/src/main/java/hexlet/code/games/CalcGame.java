package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Random;

public class CalcGame {
    private static final String GAME_DESCRIPTION = "What is the result of the expression?";
    private static final String[] OPERATORS = {"+", "-", "*"};
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
            int number1 = random.nextInt(MAX_NUMBER) + 1;
            int number2 = random.nextInt(MAX_NUMBER) + 1;
            String operator = OPERATORS[random.nextInt(OPERATORS.length)];
            String question = number1 + " " + operator + " " + number2;
            int correctAnswer = calculateResult(number1, number2, operator);
            questionsAndAnswers[i][0] = question;
            questionsAndAnswers[i][1] = String.valueOf(correctAnswer);
        }
        return questionsAndAnswers;
    }

    private static int calculateResult(int number1, int number2, String operator) {
        switch (operator) {
            case "+":
                return number1 + number2;
            case "-":
                return number1 - number2;
            case "*":
                return number1 * number2;
            default:
                throw new IllegalArgumentException("Unknown operator: " + operator);
        }
    }
}
