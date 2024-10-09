package hexlet.code.games;

import hexlet.code.utils.Utils;

public class Even {
    private static String correctAnswer;

    public static String getDescription() {
        return "Answer 'yes' if the number is even, otherwise answer 'no'.";
    }

    public static String generateQuestion() {
        int number = Utils.getRandomInt(1, 100);
        correctAnswer = number % 2 == 0 ? "yes" : "no";
        return String.valueOf(number);
    }

    public static String getCorrectAnswer() {
        return correctAnswer;
    }
}
