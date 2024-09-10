package hexlet.code.games;

import hexlet.code.Game;
import java.util.Random;

public class Calc implements Game {
    private final Random random = new Random();
    private int correctAnswer;

    @Override
    public String getDescription() {
        return "What is the result of the expression?";
    }

    @Override
    public String generateQuestion() {
        int number1 = random.nextInt(100) + 1;
        int number2 = random.nextInt(100) + 1;
        char operator = getRandomOperator();
        correctAnswer = calculate(number1, number2, operator);

        return number1 + " " + operator + " " + number2;
    }

    @Override
    public String getCorrectAnswer() {
        return String.valueOf(correctAnswer);
    }

    private char getRandomOperator() {
        int operatorIndex = random.nextInt(3);
        return switch (operatorIndex) {
            case 0 -> '+';
            case 1 -> '-';
            case 2 -> '*';
            default -> throw new IllegalStateException("Unexpected value: " + operatorIndex);
        };
    }

    private int calculate(int number1, int number2, char operator) {
        return switch (operator) {
            case '+' -> number1 + number2;
            case '-' -> number1 - number2;
            case '*' -> number1 * number2;
            default -> throw new IllegalStateException("Unexpected value: " + operator);
        };
    }
}
