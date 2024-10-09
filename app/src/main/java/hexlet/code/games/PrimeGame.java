package hexlet.code.games;

import hexlet.code.utils.Utils;

public class PrimeGame {
    private static int number;

    public static String getDescription() {
        return "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
    }

    public static String generateQuestion() {
        number = Utils.getRandomInt(1, 100); // Генерация случайного числа от 1 до 100
        return String.valueOf(number);
    }

    public static String getCorrectAnswer() {
        return Utils.isPrime(number) ? "yes" : "no";
    }
}
