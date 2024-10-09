package hexlet.code.games;

import hexlet.code.utils.Utils;

public class Calc {
    private static int correctAnswer;

    public static String getDescription() {
        return "What is the result of the expression?";
    }

    public static String generateQuestion() {
        int number1 = Utils.getRandomInt(1, 100);
        int number2 = Utils.getRandomInt(1, 100);
        char operator = Utils.getRandomOperator();
        correctAnswer = Utils.calculate(number1, number2, operator);

        return number1 + " " + operator + " " + number2;
    }

    public static String getCorrectAnswer() {
        return String.valueOf(correctAnswer);
    }
}
