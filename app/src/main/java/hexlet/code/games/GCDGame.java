package hexlet.code.games;

import hexlet.code.utils.Utils;

public class GCDGame {
    private static int number1;
    private static int number2;

    public static String getDescription() {
        return "Find the greatest common divisor of given numbers.";
    }

    public static String generateQuestion() {
        number1 = Utils.getRandomInt(1, 100);
        number2 = Utils.getRandomInt(1, 100);
        return String.format("%d %d", number1, number2);
    }

    public static String getCorrectAnswer() {
        return String.valueOf(Utils.gcd(number1, number2));
    }
}
